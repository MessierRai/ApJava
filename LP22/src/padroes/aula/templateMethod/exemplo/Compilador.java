package padroes.aula.templateMethod.exemplo;

import javax.swing.JOptionPane;

public abstract class Compilador {

	// template method
	public final void compilar() {
		setCodigo();
		compile();
		execute();
	}
	
	// operacao gancho - hook method
	public String setCodigo() {
		return JOptionPane.showInputDialog("Codigo");
	}
	// operacao primitiva
	public abstract void compile();
	// operacao primitiva
	public abstract void execute();
	
}
