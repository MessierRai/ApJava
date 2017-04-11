package slidesp2;

public class ContaBancaria {
	String numero;
	double saldo;

	public void saldo() {
		System.out.println("R$ " + saldo);
	}

	public void saque(double aRetirar) {
		this.saldo = this.saldo - aRetirar;
		System.out.println("Sacado R$ " + aRetirar + " reais, a sua conta");
	}

	public void deposito(double aBotar) {
		this.saldo = this.saldo + aBotar;
		System.out.println("Acrescentado R$ " + aBotar + " reais, a sua conta");
	}

}
