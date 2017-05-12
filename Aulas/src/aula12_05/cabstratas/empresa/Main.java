package aula12_05.cabstratas.empresa;

public class Main {

	public static void main(String[] args) {
		Gerente ger = new Gerente(200.0f);
		Vendedor ven = new Vendedor(200.0f);
		
		System.out.println(ger.calculaSalario(30));
		System.out.println(ven.calculaSalario(30));
	}

}
