package padroes.aula.templateMethod.estrutura;

public abstract class ClasseA {

	public void templateMethod() {
		// ...
		opPrimitiva1();
		// ...
		opPrimitiva2();
		// ...
	}
	
	public abstract void opPrimitiva1();

	public abstract void opPrimitiva2();

}
