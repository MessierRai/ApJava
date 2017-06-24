package htl.bates.excecoes;

@SuppressWarnings("serial")
public class HoraTrabalhoNegativoException extends Exception {
	
	public HoraTrabalhoNegativoException() {
		super("Valor da hora de trabalho não pode ser negativo!");
	}

}
