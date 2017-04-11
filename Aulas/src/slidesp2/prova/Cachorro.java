package slidesp2.prova;

public class Cachorro extends Animal {
	
	public void latir() {
		System.out.println("Latindo!");
	}

	@Override
	protected void caminhar() {
		System.out.println("Caminhando!");
	}
	
	@Override
	protected void comer(int qtd) {
		System.out.println("Comendo " + qtd + " u.q. de comida");
		System.out.println("Roendo osso!");
	}

}
