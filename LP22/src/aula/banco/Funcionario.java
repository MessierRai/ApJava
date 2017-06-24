package aula.banco;

public class Funcionario extends User {

	// Atributos
	private float salario;
	
	// Construtor
	public Funcionario(String nome, String login, String senha) {
		super(nome, login, senha);
	}

	// Metodos
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
