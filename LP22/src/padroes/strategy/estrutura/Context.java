package padroes.strategy.estrutura;

public class Context {

	private Strategy stragety;

	public void execute() {
		getStragety().algoritmo();
	}
	
	public Strategy getStragety() {
		return stragety;
	}

	public void setStragety(Strategy stragety) {
		this.stragety = stragety;
	}
}
