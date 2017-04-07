package aula07_04.banco;

public class Conta {
	
	private String numero;
	private float saldo;
	
	public Conta(String numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
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
