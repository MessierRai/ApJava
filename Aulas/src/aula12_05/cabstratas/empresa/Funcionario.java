package aula12_05.cabstratas.empresa;

public abstract class Funcionario {
	
	private float salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(float salario) {
		this.salario = salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public abstract float calculaSalario(int dias);

}
