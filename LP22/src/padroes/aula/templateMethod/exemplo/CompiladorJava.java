package padroes.aula.templateMethod.exemplo;

import javax.swing.JOptionPane;

public class CompiladorJava extends Compilador {

	private String codigo;
	
	public void compile() {
		this.codigo = setCodigo();
		if (this.codigo.contains("public static void main")) {
			JOptionPane.showMessageDialog(null, "Compilado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao compilar!");
		}
	}

	public void execute() {
		JOptionPane.showMessageDialog(null, "Hello World!");
	}

}
