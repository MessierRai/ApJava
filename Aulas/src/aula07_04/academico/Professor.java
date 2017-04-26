package aula07_04.academico;

import java.util.ArrayList;

public class Professor extends User {
	
	public final static String ESPECIALIZACAO = "Especialização";
	public final static String MESTRADO = "Mestrado";
	public final static String DOUTORADO = "Doutorado";
	private String nivel;
	private ArrayList<Disciplina> disciplinas;
	
	public Professor(String nome, String login, String senha, String nivel) {
		super(nome, login, senha);
		this.nivel = nivel;
		this.disciplinas = new ArrayList<Disciplina>();
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		if (nivel.equals(ESPECIALIZACAO) || nivel.equals(MESTRADO) || nivel.equals(DOUTORADO)) {
			this.nivel = nivel;
		}
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void addDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	public void removeDisciplinas(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
	}
	
}
