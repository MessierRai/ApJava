package lp2_cabstratas.empresa;

public class Vendedor extends Funcionario {

	private String classe;
	private int qtdVendas;
	
	public Vendedor(float salario) {
		super(salario);
	}
	
	public float calcularSalario(int dias) {
		qtdVendas = 5;
		return (getSalario() * dias) 
				+ (qtdVendas * getSalario() * 0.01f);
	}
	
}
