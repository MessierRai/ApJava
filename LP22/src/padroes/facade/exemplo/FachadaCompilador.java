package padroes.facade.exemplo;

public class FachadaCompilador {

	public void compilar() {
		Scanner s = new Scanner();
		Parser p = new Parser();

		s.scan();
		p.parse();
	}

}
