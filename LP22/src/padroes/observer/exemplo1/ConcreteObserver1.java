package padroes.observer.exemplo1;

public class ConcreteObserver1 extends Observer {

	public void update(Subject s) {
		ConcreteSubject cs = (ConcreteSubject) s;
		System.out.println(cs.getNome());
		System.out.println(cs.getValor());
	}
	
}
