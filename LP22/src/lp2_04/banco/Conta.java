package lp2_04.banco;

public class Conta {

	// Atributos
	private String numero;
	private float saldo;
	
	// Construtores
	public Conta(String numero) { // Construtor
		this.numero = numero;
		this.saldo = 0.0f;
	}

	// Metodos
	public String getNumero() {
		return numero;
	}

	// Comentário: O numero da conta nao pode ser alterado...
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}

	// Operacao 'saldo'
	public float getSaldo() {
		return saldo;
	}

	// Operacoes saque e deposito alteram o saldo
	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	// Operacao saque
	public void saque(float valor) {
		if ((valor > 0) && (valor <= saldo)) {
			setSaldo(saldo - valor);
		}
	}

	// Operacao deposito
	public void deposito(float valor) {
		if (valor > 0) {
			setSaldo(saldo + valor);
		}
	}
	
}
