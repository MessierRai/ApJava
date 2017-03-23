package herewegoagain;

public class TestArea {

	public static void main(String[] args) {
		Empregado um = new Empregado("Ficticio", 35, 1577.0, "Analista Júnior");
		
		um.getNome();
		um.getCargo();
		um.getSalarioMensal();
		um.setSalarioMensal(-67.4);
		um.getSalarioMensal();

	}

}
