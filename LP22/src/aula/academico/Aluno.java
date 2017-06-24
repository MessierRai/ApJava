package aula.academico;

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
		return this.matricula;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		ArrayList<Disciplina> d = new ArrayList<Disciplina>();
		for(AlunoDisciplina ad : disciplinas) {
			d.add(ad.getDisciplina());
		}
		return d;
	}
	public void matricular(Disciplina disciplina) {
		AlunoDisciplina ad = new AlunoDisciplina(this, disciplina);
		disciplinas.add(ad);
		disciplina.matricular(ad);
	}

}
