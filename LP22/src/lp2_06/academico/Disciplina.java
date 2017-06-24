package lp2_06.academico;

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
		this.alunos = new ArrayList<AlunoDisciplina>();
	}

	// Metodos
	public ArrayList<Aluno> getAlunos() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		for (AlunoDisciplina alunoDisciplina : this.alunos) {
			alunos.add(alunoDisciplina.getAluno());
		}
		return alunos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getCodigo() {
		return codigo;
	}

}
