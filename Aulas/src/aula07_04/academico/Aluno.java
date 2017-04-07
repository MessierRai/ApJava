package aula07_04.academico;

public class Aluno extends User {
	
	private int matricula;
	
	public Aluno(String nome, String login, String senha, int matricula) {
		super(nome, login, senha);
		this.matricula = matricula;
		
	}

	public int getMatricula() {
		return this.matricula;
	}

}
