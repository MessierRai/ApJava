package CeV.heranca;

public class Aluno extends Pessoa {
	
	private int matr;
	private String curso;
	
	public Aluno(String nome, int idade, String sexo, int matr, String curso) {
		super(nome, idade, sexo);
		this.matr = matr;
		this.curso = curso;
	}
	
	public int getMatr() {
		return this.matr;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada!");
	}

}
