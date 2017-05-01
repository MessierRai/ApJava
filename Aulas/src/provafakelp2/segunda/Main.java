package provafakelp2.segunda;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ordinario", 456);
		Aluno a2 = new Aluno("Ordinario1", 567);
		Aluno a3 = new Aluno("Ordinario2", 678);
		
		Classe c1 = new Classe("Sala 2a");
		
		a1.addNotas(8.7f, 7.5f, 2.7f, 5.8f);
		a2.addNotas(1.2f, 5.4f, 2.7f, 6.0f);
		a3.addNotas(5.4f, 6.8f, 10.0f, 9f);
		
		c1.setAlunos(a1);
		c1.setAlunos(a2);
		c1.setAlunos(a2);
		
		c1.getNome();
		c1.getAlunos();
		
		System.out.println();
		
		c1.boletim();
		
		
	}

}
