package htl.bates.excecoes;

@SuppressWarnings("serial")
public class TipoErradoException extends Exception {
	
	public TipoErradoException() {
		super("Tipo de hospede inválido!");
	}

}
