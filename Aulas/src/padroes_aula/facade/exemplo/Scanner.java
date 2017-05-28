package padroes_aula.facade.exemplo;

public class Scanner {
	
	public void scan() {
		
		System.out.println("Scan");
		Token t = new Token();
		t.tokenize();
	}

}
