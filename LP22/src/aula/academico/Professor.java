package aula.academico;

import java.util.ArrayList;

public class Professor extends User {

	public static final String ESPECIALIAZACAO = "Especialização";
	public static final String MESTRADO = "Mestrado";
	public static final String DOUTORADO = "Doutorado";
	
	// Atributos
	private String nivel;
	private ArrayList<Disciplina> disciplinas;

	// Construtores
	public Professor(String nome, String login, String senha, String nivel) {
		super(nome, login, senha);
		this.nivel = nivel;
	}

	// Metodos
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	public void removeDisciplina(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
	}
	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		if ( (getNivel().equals(ESPECIALIAZACAO) && nivel.equals(MESTRADO)) 
		|| (getNivel().equals(MESTRADO) && nivel.equals(DOUTORADO)) ){
			this.nivel = nivel;
		}
	}

}


