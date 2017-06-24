package lp2_exceptions;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) 
			throws NomeInvalidoException, IdadeNegativaException {
		setIdade(idade);
		setNome(nome);
	}
	public void setNome(String nome) throws NomeInvalidoException {
		if (nome.length() == 0) {
			throw new NomeInvalidoException();
		} else {
			this.nome = nome;			
		}
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) throws IdadeNegativaException {
		if (idade < 0) {
			throw new IdadeNegativaException();
		}
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
}
