package padroes.observer.estrutura;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.setNome("teste");
		s.setValor(5);
		
		Observer a = new ConcreteObserver();
		Observer b = new ConcreteObserver2();
		
		s.add(a);
		s.add(b);
		
		s.setNome("teste2");
		s.setValor(10);
	}

}
