package padroes.facade.exemplo;

public class Scanner {

	public void scan() {
		System.out.println("scanning...");
		Tokenize t = new Tokenize();
		t.tokenize();
	}
	
}
