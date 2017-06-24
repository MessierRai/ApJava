package padroes.prototype.estrutura;

public class ConcretePrototype implements Prototype {
	
	public Prototype clonar() {
		ConcretePrototype clone = new ConcretePrototype();
		// ...
		return clone;
	}

}
