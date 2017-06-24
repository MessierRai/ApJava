package aula.academico;

public class AlunoDisciplina {

	private Aluno aluno;
	private Disciplina disciplina;
	private float nota;
	
	public AlunoDisciplina(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = 0.0f;
	}
	
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public Aluno getAluno() {
		return aluno;
	}
	
}
