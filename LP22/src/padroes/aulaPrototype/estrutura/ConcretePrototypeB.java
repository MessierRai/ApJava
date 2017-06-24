package padroes.aulaPrototype.estrutura;

public class ConcretePrototypeB extends Prototype {

	public Prototype clonar() {
		return new ConcretePrototypeB();
	}
	
}
