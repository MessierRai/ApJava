package padroes.aulaStrategy.estrutura;

public class Contexto {

	private Strategy strategy;

	public Contexto() {
		strategy = new ConcreteStrategyA();
	}
	
	public void metodo() {
		strategy.algoritmo();
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
