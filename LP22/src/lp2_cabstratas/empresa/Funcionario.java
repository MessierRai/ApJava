package lp2_cabstratas.empresa;

public abstract class Funcionario {

	private float salario;
	
	public Funcionario(float salario) {
		this.salario = salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public float calcularSalario(int dias) {
		return getSalario() * dias;
	}
	
}
