package aula07_04.banco;

public class Funcionario extends User{
	
	private float salario;
	
	public Funcionario(String nome, String login, String senha) {
		super(nome, login, senha);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
