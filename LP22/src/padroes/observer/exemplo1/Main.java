package padroes.observer.exemplo1;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.setNome("nome 1");
		s.setValor(5);
		
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		
		s.add(observer1);
		s.add(observer2);
		
		s.setNome("nome 2");
		s.setValor(10);
	}

}
