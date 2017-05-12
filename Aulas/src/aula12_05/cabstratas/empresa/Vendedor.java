package aula12_05.cabstratas.empresa;

public class Vendedor extends Funcionario {
	
	private String classe;
	private int qtdVendas;
	
	public Vendedor(float salario) {
		super(salario);
	}
	
	@Override
	public float calculaSalario(int dias) {
		return (getSalario() * dias) + (this.qtdVendas * getSalario() * 0.01f); 
	}

}
