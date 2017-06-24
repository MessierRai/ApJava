package padroes.strategy.estrutura;

public class Main {

	public static void main(String[] args) {
		Context c = new Context();
		c.setStragety(new ConcreteStrategyA());
		c.execute();
		
		c.setStragety(new ConcreteStrategyB());
		c.execute();
	}
	
}
