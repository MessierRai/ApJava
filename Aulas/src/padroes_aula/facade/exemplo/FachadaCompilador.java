package padroes_aula.facade.exemplo;

public class FachadaCompilador {
	
	public void compilar() {
		Parser p = new Parser();
		p.parse();
		Scanner s = new Scanner();
		s.scan();
	}

}
