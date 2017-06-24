package padroes.aula.strategy;

public class Context {

	public void contextInterface(int x){
		Strategy s = new StrategyA();
		if (x == 2) {
			s = new StrategyB();
		}
		s.metodo();
	}
	
	public static void main(String[] args) {
		Context c = new Context();
		c.contextInterface(1);
		c.contextInterface(2);
	}
	
}
