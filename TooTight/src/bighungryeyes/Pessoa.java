package bighungryeyes;

public class Pessoa {
	
	private String nome;
	private Data dataNasc;
	private Endereco endereco;
	private Contato contato;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.dataNasc = new Data(dia, mes, ano);
	}
	
	public Pessoa(String nome, int dia, int mes, int ano, String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.nome = nome;
		this.dataNasc = new Data(dia, mes, ano);
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, estado, cep);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return this.contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
