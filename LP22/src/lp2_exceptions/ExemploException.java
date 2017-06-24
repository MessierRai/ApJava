package lp2_exceptions;

//criando uma excecao
public class ExemploException extends Exception {

	public ExemploException() {
		super("Exceção exemplo!");
	}
	
	public ExemploException(String m) {
		super(m);
	}

}

