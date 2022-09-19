package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getData(String columnName) {
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		String sqlUsername = "root";
		String sqlPassword = "root";
		String sqlUrl = "jdbc:mysql://localhost:3306/mydataDB";
		String sqlQurey = "SELECT*FROM USERS;";

		
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
		
		
			statement = connection.createStatement();
		
			resultSet = statement.executeQuery(sqlQurey);
		
			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);
				return columnValue;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return columnValue;

	}
}
