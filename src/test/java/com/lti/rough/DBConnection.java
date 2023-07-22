package com.lti.rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		
		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "admin");
		

		Statement st = con.createStatement();
		String sql = ("Select * from customer;");
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) { 
		 String fname = rs.getString("customer_first_name"); 
		 String lname = rs.getString("customer_last_name");
		 System.out.println(fname+ " "+ lname);
		}
		

		con.close();

	}

}
