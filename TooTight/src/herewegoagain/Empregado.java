package herewegoagain;

public class Empregado extends Pessoa {
	private double salarioMensal;
	private String cargo;
	private String endereco;
	
	public Empregado(String nome, int idade, double salarioMensal, String cargo, String endereco) {
		super(nome,idade);
		this.salarioMensal = salarioMensal;
		this.cargo = cargo;
		this.endereco = endereco;
	}
	public Empregado(String nome, int idade, double salarioMensal) {
		super(nome,idade);
		this.salarioMensal = salarioMensal;
	}
	public Empregado(String nome, int idade, double salarioMensal, String cargo) {
		super(nome,idade);
		this.salarioMensal = salarioMensal;
		this.cargo = cargo;
	}
	
	public void getSalarioMensal() {
		System.out.println(this.salarioMensal);
	}
	public void setSalarioMensal(double salarioMensal) {
		if(validarSalario(salarioMensal)) {
			this.salarioMensal = salarioMensal;
		}else {
			System.out.println("Valor Inválido!");
		}
		
	}
	public void getCargo() {
		System.out.println(this.cargo);
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void getEndereco() {
		System.out.println(this.endereco);
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean validarSalario(double salarioMensal) {
		if(salarioMensal >= 0) {
			return true;
		}else {
			return false;
		}
	}
}
