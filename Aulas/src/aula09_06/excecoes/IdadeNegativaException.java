package aula09_06.excecoes;

public class IdadeNegativaException extends Exception {
	
	public IdadeNegativaException() {
		super("Idade não pode receber valores negativos!");
	}

}
