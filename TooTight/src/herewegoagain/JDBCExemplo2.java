package herewegoagain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo2 {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
	private static final String Driver = "commysql.jdbc.Driver";
	private static final String User = "root";
	private static final String Pass = "123456789";
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(Driver);
			return DriverManager.getConnection(URL, User, Pass);
		} catch(ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

}
