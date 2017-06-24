package padroes.strategy.exemplo;

public class Main {

	public static void main(String[] args) {
		ListaNomes c = new ListaNomes();
		c.setStragety(new InsertSort());

		c.addNome("José");
		c.addNome("Maria");
		c.addNome("João");
		c.addNome("Teresa");
		c.addNome("Eva");
		c.addNome("Adão");

		c.execute();
	}
	
}
