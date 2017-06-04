package br.edu.theproject.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.theproject.jdbc.ConexaoSQL;
import br.edu.theproject.molde.Funcionario;
import br.edu.theproject.molde.Personal;

public class Ops {
	
	public void cdAtendente(Funcionario na) {
		try {
			
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "INSERT INTO funcionario(nome, cpf, id_cargoFK) VALUES (?, ?, ?)";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			stat.setString(1, na.getNome());
			stat.setString(2, na.getCPF());
			stat.setInt(3, 2);
			
			stat.execute();
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}
	
	public void cdGerente(Funcionario ng) {
		try {
			
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "INSERT INTO funcionario(nome, cpf, id_cargoFK) VALUES (?, ?, ?)";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			stat.setString(1, ng.getNome());
			stat.setString(2, ng.getCPF());
			stat.setInt(3, 1);
			
			stat.execute();
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}
	
	public void cdPersonal(Personal prs) {
		try {
			
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "INSERT INTO funcionario(nome, cpf, id_cargoFK) VALUES (?, ?, ?)";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			stat.setString(1, prs.getNome());
			stat.setString(2, prs.getCPF());
			stat.setInt(3, 3);
			
			stat.execute();
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}
	
	public void cdCliente() {
		
	}
	
	public void cdBens() {
		
	}
	
	public void cdAtividade() {
		
	}
	
	public void grStats() {
		
	}
	
	public void grComprovante() {
		
	}
	
	public void lsClientes() {
		
	}
	
	public void lsFuncionarios() {
		
	}
	
	public void lsBens() {
		
	}
	
	public void lsAtividades() {
		
	}
	
	public int obterCargo(int id) {
		int cod = 0;
		try {
			
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "SELECT id_cargoFK FROM funcionario WHERE id = ?;";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			stat.setInt(1, id);
			
			ResultSet codCargo = stat.executeQuery();
			
			while(codCargo.next()) {
				cod = codCargo.getInt("id_cargoFK");
			}
			
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return cod;
	}
	
	public int obterId(Funcionario ord) {
		int cod = 0;
		try {
			
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "SELECT id FROM funcionario WHERE nome = ?;";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			stat.setString(1, ord.getNome());
			
			ResultSet codCargo = stat.executeQuery();
			
			while(codCargo.next()) {
				cod = codCargo.getInt("id");
			}
			
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return cod;
		
	}
	
	public void cdLogin(int id) {
		try {
			Connection abrirConx = ConexaoSQL.getInstance().getConnection();
			
			String sql = "INSERT INTO login(id_funcionarioFK, senha) VALUES (?, ?);";
			
			PreparedStatement stat = abrirConx.prepareStatement(sql);
			
			stat.setInt(1, id);
			stat.setString(2, "123456");
			
			stat.execute();
			stat.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(validar(1));
	}

}
