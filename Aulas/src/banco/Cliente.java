package banco;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	public ArrayList<Conta> contas;
	
	public Cliente(String nome, String numero) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		//this.conta = conta;
	}
	
	public void addConta(String numero) {
		Conta nova = new Conta(numero);
		this.contas.add(nova);
	}
	
	public void removeConta(Conta c) {
		this.contas.remove(c);
	}
	
	
	public String getNome() {
		return this.nome;
	}
}
