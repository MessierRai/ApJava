package lp2_exceptions;

public class NomeInvalidoException extends Exception {

	public NomeInvalidoException() {
		super("Um nome deve possuir ao menos uma letra!");
	}
	
}
