package lp2_03;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	
	// Construtores
	public Pessoa() { // Construtor padrao
		nome = "";
		idade = 0;
	}
	
	public Pessoa(String nome, int idade) { // Construtor
		this.nome = nome;
		this.idade = idade;
	}
	
	// Metodos
	public String saudacao() {
		return "Ola meu nome é " + nome;
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		System.out.println(p1.saudacao());

		Pessoa p2 = new Pessoa("Maria", 25);
		System.out.println(p2.saudacao());
	}

}
