package lp2_06.academico;

import java.util.ArrayList;

public class Professor extends User {

	// Atributos
	private String matricula;
	private ArrayList<Disciplina> disciplinas;

	// Construtores
	public Professor(String nome, String login, String senha, String matricula) {
		super(nome, login, senha);
		this.matricula = matricula;
	}

	// Metodos
	public String getMatricula() {
		return matricula;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
	}

}
