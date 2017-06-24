package banco;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void saque(double valor) throws SaqueException {
		if(valor < 0 || valor > saldo) {
			throw new SaqueException();
		}
		setSaldo(this.saldo - valor);
		
	}
	
	public void deposito(double valor) throws DepositoException {
		if(valor < 0) {
			throw new DepositoException();
		}
		setSaldo(valor + this.saldo);
		
	}
}
