package aula12_05.cabstratas.empresa;

public class Gerente extends Funcionario {
	
	private byte nivel;
	
	public Gerente(float salario) {
		super(salario);
	}

	@Override
	public float calculaSalario(int dias) {
		return (getSalario() * dias) * 1.2f;
	}

}
