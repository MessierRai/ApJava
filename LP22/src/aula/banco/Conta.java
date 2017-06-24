package aula.banco;

public class Conta {

	// Atributos
	private String numero;
	private float saldo;

	// Construtor
	public Conta(String numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// Metodos
	public String getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
