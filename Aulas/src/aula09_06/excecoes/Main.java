package aula09_06.excecoes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Forneça um nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça uma idade: "));
		try {
			Pessoa p = new Pessoa(nome, idade);
			JOptionPane.showMessageDialog(null, p.getNome() + " " + p.getIdade());
		} catch (NomeInvalidoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IdadeNegativaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Inesperado!");
		}
		
	}

}
