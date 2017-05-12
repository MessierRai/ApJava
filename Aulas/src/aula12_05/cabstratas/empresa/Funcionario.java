package aula12_05.cabstratas.empresa;

public class Funcionario {
	
	private float salario;
	
	public Funcionario(float salario) {
		this.salario = salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return this.salario;
	}
	
	public float calculaSalario(int dias) {
		return dias * this.getSalario();
	}

}
