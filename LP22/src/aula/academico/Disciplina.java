package aula.academico;

import java.util.ArrayList;

public class Disciplina {
	// Atributos
	private String codigo;
	private String titulo;
	private Professor professor;
	private ArrayList<AlunoDisciplina> alunos;

	// Construtores
	public Disciplina(String codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public Disciplina(String codigo, String titulo, Professor professor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.professor = professor;
	}

	// Metodos
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public ArrayList<Aluno> getAlunos() {
		ArrayList<Aluno> a = new ArrayList<Aluno>();
		for(AlunoDisciplina ad : alunos) {
			a.add(ad.getAluno());
		}
		return a;
	}
	public void matricular(AlunoDisciplina ad) {
		alunos.add(ad);
	}
	
}
