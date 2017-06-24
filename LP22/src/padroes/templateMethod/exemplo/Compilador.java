package padroes.templateMethod.exemplo;

import javax.swing.JOptionPane;

public abstract class Compilador {

	// template method
	public void compilador() {
		String codigo = leitura();
		setCodigoFonte(codigo);
		compila();
	}
	
	// Hook method
	public String leitura() {	
		return JOptionPane.showInputDialog("Código");
	}
	
	// Operacao aabstrata 1
	public abstract void setCodigoFonte(String codigo);

	// Operacao aabstrata 2
	public abstract void compila();

}
