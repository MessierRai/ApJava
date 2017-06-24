package lp2_03.banco;

public class RunConta {

	public static void main(String[] args) {
		Conta c = new Conta("0426-5");
		// c.saldo = 200.0f; // nao e' possivel acessar os atributos diretamente

		System.out.println(c.getNumero() + " " + c.getSaldo());
		c.deposito(200.0f);
		System.out.println(c.getNumero() + " " + c.getSaldo());
		c.saque(100.0f);
		System.out.println(c.getNumero() + " " + c.getSaldo());
	}

}
