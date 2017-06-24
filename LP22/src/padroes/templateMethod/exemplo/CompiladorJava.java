package padroes.templateMethod.exemplo;

import javax.swing.JOptionPane;

public class CompiladorJava extends Compilador {

	private String codigoFonte;

	// Operacao 1
	public void setCodigoFonte(String codigo) {
		this.codigoFonte = codigo;
	}

	// Operacao 2
	public void compila() {
		if (this.codigoFonte.contains("public static void main(String[] args)") 
				&& this.codigoFonte.contains("System.out.println")) {
			JOptionPane.showMessageDialog(null, "Código compilado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao compilar o código!");
		}
	}

}
