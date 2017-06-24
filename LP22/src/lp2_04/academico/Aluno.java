package lp2_04.academico;

public class Aluno {

	// Atributos
	String nome;
	String matricula;
	float nota1;
	float nota2;

	// Construtores
	public Aluno(String nome, String matricula) { // Construtor
		this.nome = nome;
		this.matricula = matricula;
	}

	// Metodos
	public float media() {
		return (nota1 + nota2) / 2;
	}
}
