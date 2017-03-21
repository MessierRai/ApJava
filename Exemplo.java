import javax.swing.JOptionPane;

public class Exemplo {
	public static void main(String[] args) {
		int semana = Integer.parseInt(JOptionPane.showInputDialog("Dia da semana: "));
		switch (semana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			default:
				System.out.println("Filho... De 1-7.");
				break;

		}
	}
}