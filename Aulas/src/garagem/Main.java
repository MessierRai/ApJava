package garagem;

public class Main {

	public static void main(String[] args) {
		Carro c = new Carro("Qualquer", "Ordinario");
		
		System.out.println(c.getMarca());
		System.out.println(c.getModelo());
		c.Acelerar();

	}

}
