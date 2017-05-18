package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	
	public static String status = "Não conectou...";
	
	public ConexaoMySQL() {
		
	}
	
	public static java.sql.Connection getConexaoMySQL() {
		Connection connection = null;
		
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			String serverName = "localhost";
			String mydatabase = "meubanco";
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			String username = "root";
			String password = "123456789";
			connection = DriverManager.getConnection(url, username, password);
			
			if(connection != null) {
				status = "STATUS---->Conectado com sucesso!!";
			}else {
				status = "STATUS--->Não foi possivel realizar conexão!";
			}
			
			return connection;
		}catch(ClassNotFoundException e) {
			System.out.println("O driver especificado não foi encontrado!");
			return null;
		}catch(SQLException e) {
			System.out.println("Não foi possivel conectar ao banco de dados.");
			return null;
		}
	}
	
	public static String statusConnection() {
		return status;
	}
	
	public static boolean fecharConexao() {
		try {
			ConexaoMySQL.getConexaoMySQL().close();
			return true;
		}catch(SQLException e) {
			return false;
		}
	}
	
	public static java.sql.Connection reiniciarConexao() {
		fecharConexao();
		return ConexaoMySQL.getConexaoMySQL();
	}

}
