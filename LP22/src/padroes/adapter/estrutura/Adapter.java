package padroes.adapter.estrutura;

public class Adapter implements Target {

	public void request() {
		Adaptee a = new Adaptee();
		a.specificRequest();
	}
	
}
