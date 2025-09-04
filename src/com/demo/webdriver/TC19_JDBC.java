package com.demo.webdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TC19_JDBC {

	public static void main(String[] args) {

		try {

			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// Create the statment
			Statement stmt = conn.createStatement();
//			PreparedStatement ps = conn.prepareStatement("select * from test.students");

			// Execute the query
//			ResultSet rs = stmt.executeQuery("select * from test6.students");
//			ResultSet rs = ps.executeQuery();

//			String sql = "INSERT INTO test.students(student_id, student_name,age,city,course_id) VALUES (188, 'Muzammil',12,'Nellore',9)";
			String sql = "INSERT INTO test.stu_name(stu_name) VALUES ('Muzammil')";

			stmt.executeUpdate(sql);
			
			//processing result set
			ResultSet rs = stmt.executeQuery("select * from test.stu_name where stu_name='Muzammil'");

			while (rs.next()) {
//				System.out.println(rs.getString("student_name") + "  " + rs.getInt("age"));
			System.out.println(rs.getString("stu_name"));
			}

			// closing the connection
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
