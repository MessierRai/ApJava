package lp2_03.academico;

public class RunAluno {

	public static void main(String[] args) {
		// Aluno a1 = new Aluno(); // nao existe construtor padrao

		Aluno a2 = new Aluno("PEdro", "201655M23");
		a2.nota1 = 8.0f;
		a2.nota2 = 9.0f;
		System.out.println(a2.media());
	}

}
