package htl.bates.excecoes;

@SuppressWarnings("serial")
public class CapacidadeInvalidaException extends Exception {
	
	public CapacidadeInvalidaException() {
		super("Capacidade invalida - capacidade(1-3)");
	}

}
