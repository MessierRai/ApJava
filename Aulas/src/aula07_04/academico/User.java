package aula07_04.academico;

public abstract class User {
	private String nome;
	private String login;
	private String senha;
	
	public User(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	private String getSenha() {
		return this.senha;
	}
	
	private void setSenha(String senha) {
		this.senha = senha;
	}
}
