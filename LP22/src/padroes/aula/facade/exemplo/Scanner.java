package padroes.aula.facade.exemplo;

public class Scanner {

	public void scan(){
		System.out.println("scanning");
		Token t = new Token();
		t.tokenize();
	}
	
}
