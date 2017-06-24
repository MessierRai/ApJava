package aula09_06.excecoes;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) throws NomeInvalidoException, IdadeNegativaException {
		this.setNome(nome);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeInvalidoException {
		if(nome.length() == 0) {
			throw new NomeInvalidoException();
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IdadeNegativaException {
		if(idade < 0) {
			throw new IdadeNegativaException();
		}
		this.idade = idade;
	}
}
