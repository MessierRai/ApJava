package herewegoagain;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.setIdade(idade);
	}

	public void getNome() {
		System.out.println(this.nome);
	}
	public void getIdade() {
		System.out.println(this.idade);
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
