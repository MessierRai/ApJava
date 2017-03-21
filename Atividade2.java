import javax.swing.JOptionPane;

public class Atividade2 {
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Dia");
		String mes = JOptionPane.showInputDialog("Mes");
		String ano = JOptionPane.showInputDialog("Ano");
		JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
		String mseStr = "";
		switch (mes) {
			case "1":
				mseStr = "jan";
				break;
			case "2":
				mseStr = "fev";
				break;
			case "3":
				mseStr = "mar";
				break;
			case "4":
				mseStr = "abr";
				break;
			case "5":
				mseStr = "mai";
				break;
		}
		JOptionPane.showMessageDialog(null, dia+" "+mseStr+" "+ano);
	}
}