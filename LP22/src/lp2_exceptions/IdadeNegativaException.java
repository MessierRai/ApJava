package lp2_exceptions;

public class IdadeNegativaException extends Exception {

	public IdadeNegativaException() {
		super("Idade não pode receber valores negativos!");
	}
	
}
