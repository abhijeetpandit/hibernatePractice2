package org.abhi.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:D://abhi/db", "sa", "");
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from abhi_table");
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		System.out.println(conn);
	}
}
