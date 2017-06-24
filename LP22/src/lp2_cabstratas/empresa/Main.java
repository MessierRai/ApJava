package lp2_cabstratas.empresa;

public class Main {

	public static void main(String[] args) {
		//Funcionario func = new Funcionario(100.0f);
		Funcionario ger = new Gerente(100.0f);
		Funcionario ven = new Vendedor(100.0f);
		
		//System.out.println(func.calcularSalario(30));
		System.out.println(ger.calcularSalario(30));
		System.out.println(ven.calcularSalario(30));
	}

}
