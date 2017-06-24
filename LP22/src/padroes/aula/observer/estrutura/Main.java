package padroes.aula.observer.estrutura;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.setNome("teste");
		
		Observer a = new ConcreteObserver();
		Observer b = new ConcreteObserver();
		
		s.add(a);
		s.add(b);
		
		s.setNome("teste");
		
		s.remove(a);
				
	}

}
