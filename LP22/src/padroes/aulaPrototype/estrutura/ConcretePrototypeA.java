package padroes.aulaPrototype.estrutura;

public class ConcretePrototypeA extends Prototype {

	public Prototype clonar() {
		return new ConcretePrototypeA();
	}
	
}
