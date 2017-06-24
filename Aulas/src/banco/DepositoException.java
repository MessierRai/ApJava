package banco;

public class DepositoException extends Exception {
	
	public DepositoException() {
		super("Sir. não pode depositar valor negativo!");
	}

}
