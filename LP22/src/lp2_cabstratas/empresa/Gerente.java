package lp2_cabstratas.empresa;

public class Gerente extends Funcionario {

	private byte nivel;
	
	public Gerente(float salario) {
		super(salario);
	}
	
	public float calcularSalario(int dias) {
	    return getSalario() * 1.2f * dias;
	}
	
}
