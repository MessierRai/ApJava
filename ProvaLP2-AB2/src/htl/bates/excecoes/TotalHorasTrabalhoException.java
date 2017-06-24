package htl.bates.excecoes;

@SuppressWarnings("serial")
public class TotalHorasTrabalhoException extends Exception {
	
	public TotalHorasTrabalhoException() {
		super("O valor total de horas trabalhadas não pode ser negativa!");
	}

}
