package banco;

public class SaqueException extends Exception {
	
	public SaqueException() {
		super("Valor inválido. Saque não pode ser efetuado!");
	}

}
