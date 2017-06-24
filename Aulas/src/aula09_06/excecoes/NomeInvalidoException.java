package aula09_06.excecoes;

public class NomeInvalidoException extends Exception {
	
	public NomeInvalidoException() {
		super("Um nome deve possuir ao menos uma letra!");
	}

}
