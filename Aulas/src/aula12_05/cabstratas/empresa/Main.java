package aula12_05.cabstratas.empresa;

public class Main {

	public static void main(String[] args) {
		Funcionario func = new Funcionario(100.0f);
		Gerente ger = new Gerente(200.0f);
		Vendedor ven = new Vendedor(80.0f);
		
		System.out.println(func.calculaSalario(30));
		System.out.println(ger.calculaSalario(30));
		System.out.println(ven.calculaSalario(30));
	}

}
