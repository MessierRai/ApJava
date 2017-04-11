package slidesp2.prova;

public class Main {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.setNome("Ordinario");
		c.setRaca("Qualquer");
		c.getNome();
		c.getRaca();
		c.caminhar();
		c.comer(6);
		c.latir();
		
		System.out.println();
		
		Gato g = new Gato();
		g.setNome("Mais Ordinario");
		g.setRaca("Mais Qualquer");
		g.getNome();
		g.getRaca();
		g.caminhar();
		g.comer(2);
		g.miar();
	}
}
