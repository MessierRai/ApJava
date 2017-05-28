package padroes_aula.templateMethod.estrutura;

import javax.swing.JOptionPane;

public class CompiladorJava extends Compilador {
	
	private String codigo;

	@Override
	public void setCodigo() {
		this.codigo = JOptionPane.showInputDialog("Codigo");
	}

	@Override
	public void compile() {
		if(this.codigo.contains("public static void main")) {
			JOptionPane.showMessageDialog(null, "Compilado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Falhado com sucesso!");
		}
	}

	@Override
	public void execute() {
		JOptionPane.showMessageDialog(null, "Hello World!");
		
	}

}
