package padroes_aula.templateMethod.estrutura;

public abstract class Compilador {
	
	//TemplateMethod
	public void compilar() {
		setCodigo();
		compile();
		execute();
	}
	
	
	//Primitivas
	public abstract void setCodigo();
	
	public abstract void compile();
	
	public abstract void execute();

}
