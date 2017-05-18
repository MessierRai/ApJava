package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		System.out.println(ConexaoMySQL.statusConnection());
		
		Connection con = ConexaoMySQL.getConexaoMySQL();
		System.out.println(ConexaoMySQL.statusConnection());
		
		String sql = "INSERT INTO dados" +
					" (nome, idade, sexo) " +
					" values(?,?,?)";
		
		PreparedStatement af = con.prepareStatement(sql);
		
		Scanner tec = new Scanner(System.in);
		
		String nome = tec.nextLine();
		String idade = tec.nextLine();
		String sexo = tec.nextLine();
		
		af.setString(1, nome);
		af.setString(2, idade);
		af.setString(3, sexo);
		
		af.execute();
		af.close();
		
		System.out.println("Gravado!");
		
		ConexaoMySQL.fecharConexao();
	}

}
