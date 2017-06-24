package padroes.aulaPrototype;

// ConcretePrototype
public class Pessoa implements Prototype {
	private String nome;
	private int idade;
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Prototype clonar() {
		return new Pessoa(getNome(), getIdade());
	}
	// get e set
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
