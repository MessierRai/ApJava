package padroes.aulaAdapter.estrutura;

public class Adapter {

	private Adptee a; 
	
	public void metodo() {
		a = new Adptee();
		a.operacao();
	}
	
}
