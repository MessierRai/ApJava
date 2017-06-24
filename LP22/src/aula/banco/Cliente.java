package aula.banco;

public class Cliente extends User {

	// Atributos
	private Conta conta;
	
	// Construtor
	public Cliente(String nome, String login, String senha) {
		super(nome, login, senha);
	}
	
	// Metodos
	public Conta getConta() {
		return this.conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
