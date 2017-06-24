package padroes.adapter.exemplo;

public class Adapter implements Target {

	public void distancia() {
		Adaptee a = new Adaptee();
		a.distancia();
	}
	
}
