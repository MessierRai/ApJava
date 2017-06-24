package lp2_06.academico;

import java.util.ArrayList;

public class AlunoDisciplina {

	// Atributos
	private Aluno aluno;
	private Disciplina disciplina;
	private ArrayList<Float> notas;

	// Construtores
	public AlunoDisciplina(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	// Metodos
	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public ArrayList<Float> getNotas() {
		return notas;
	}

	public void addNota(float nota) {
		this.notas.add(nota);
	}

	public void removeNota(float nota) {
		this.notas.remove(nota);
	}

}
