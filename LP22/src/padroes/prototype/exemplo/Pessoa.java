package padroes.prototype.exemplo;

public class Pessoa implements Prototype {

	private int idade;
	private String nome;
	
	public Prototype clonar() {
		Pessoa clone = new Pessoa();
		clone.setIdade(getIdade());
		clone.setNome(getNome());
		return clone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int valor) {
		this.idade = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
