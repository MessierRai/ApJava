package slidesp2.prova;

public class Gato extends Animal {
	
	public void miar() {
		System.out.println("Miando!");
	}

	@Override
	protected void caminhar() {
		System.out.println("Caminhando!");
	}
	
	@Override
	protected void comer(int qtd) {
		System.out.println("Comendo " + qtd + " u.q. de comida");
		System.out.println("Tomando leite!");
	}

}
