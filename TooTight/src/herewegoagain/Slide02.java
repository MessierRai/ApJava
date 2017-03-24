package herewegoagain;

import javax.swing.JOptionPane;

public class Slide02 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
		int idade = Integer.parseInt(idadeStr);
		
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos.");

	}

}
