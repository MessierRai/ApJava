package padroes.observer.estrutura;

public class ConcreteObserver extends Observer {

	public void update(Subject s) {
		ConcreteSubject cs = (ConcreteSubject) s;
		System.out.println(cs.getNome());
		System.out.println(cs.getValor());
	}
	
}
