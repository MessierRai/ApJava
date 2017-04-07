package aula07_04.banco;

public class Cliente extends User{
	
	private Conta conta;
	
	public Cliente(String nome, String login, String senha) {
		super(nome, login, senha);
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
}
