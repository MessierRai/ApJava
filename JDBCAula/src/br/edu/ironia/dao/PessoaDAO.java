package br.edu.ironia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.ironia.dto.PessoaDTO;
import br.edu.ironia.jdbc.ConexaoUtil;

public class PessoaDAO {
	
	public void inserir(PessoaDTO pessoaDTO) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "INSERT INTO pessoa(nome) VALUES(?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, pessoaDTO.getNome());
			
			statement.execute();
			statement.close();
			
			System.out.println("Dado Inserido!");
			
		}catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	public void remover(int idPessoa) {
		try {
			
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "DELETE FROM pessoa WHERE id_pessoa = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, idPessoa);
			statement.execute();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}
	
	public List<PessoaDTO> listarTodos() {
		List<PessoaDTO> listaPessoas = new ArrayList<PessoaDTO>();
		
		try {
			
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "SELECT * FROM pessoa";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				PessoaDTO pessoaDTO = new PessoaDTO();
				pessoaDTO.setId_pessoa(resultSet.getInt("id_pessoa"));
				pessoaDTO.setNome(resultSet.getString("nome"));
				listaPessoas.add(pessoaDTO);
				
			}
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return listaPessoas;
	}
	
	public void atualizar(PessoaDTO pessoaDTO) {
		try {
			
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "UPDATE pessoa SET nome = ? WHERE id_pessoa = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, pessoaDTO.getNome());
			statement.setInt(2, pessoaDTO.getId_pessoa());
			
			statement.execute();
			statement.close();
			
			System.out.println("Dado Atualizado!");
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	public static void main(String[] args) {
		PessoaDAO pDAO = new PessoaDAO();
		
		List<PessoaDTO> listPessoas = new ArrayList<>();
		
		listPessoas = pDAO.listarTodos();
		
		for(PessoaDTO p1 : listPessoas) {
			System.out.println(p1.toString());
		}
	}

}
