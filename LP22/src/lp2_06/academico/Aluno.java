package lp2_06.academico;

import java.util.ArrayList;

public class Aluno extends User {

	// Atributos
	private String matricula;
	private ArrayList<AlunoDisciplina> disciplinas;

	// Construtores
	public Aluno(String nome, String login, String senha, String matricula) {
		super(nome, login, senha);
		this.matricula = matricula;
		this.disciplinas = new ArrayList<AlunoDisciplina>();
	}

	// Metodos
	public String getMatricula() {
		return matricula;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		for (AlunoDisciplina alunoDisciplina : this.disciplinas) {
			disciplinas.add(alunoDisciplina.getDisciplina());
		}
		return disciplinas;
	}


	public void matricular(Disciplina disciplina) {
		AlunoDisciplina ad = new AlunoDisciplina(this, disciplina);
		disciplinas.add(ad);
	}

}
