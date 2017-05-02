package CeV.polimorfismo;

public class Main {

	public static void main(String[] args) {
		Animal n = new Ave();
		
		n.alimentar();
		n.emitirSom();
		n.locomover();
	}

}
