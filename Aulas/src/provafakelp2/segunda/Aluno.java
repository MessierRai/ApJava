package provafakelp2.segunda;

public class Aluno {
	private String nome;
	private int matricula;
	private float n1, n2, n3, n4;
	

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public boolean getNomeMatricula() {
		System.out.println(this.nome + " | " + this.matricula);
		return false;
	}
	
	public void addNotas(float n1, float n2, float n3, float n4) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
	public float media() {
		float pm = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
		return pm;
	}

}
