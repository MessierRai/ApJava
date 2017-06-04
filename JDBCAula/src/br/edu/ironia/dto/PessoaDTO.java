package br.edu.ironia.dto;

public class PessoaDTO {
	
	private int id_pessoa;
	private String nome;
	
	public int getId_pessoa() {
		return this.id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.getId_pessoa() + " " + this.getNome();
	}

}
