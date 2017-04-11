package slidesp2;

public class Veiculo {
	String marca;
	String modelo;
	int velocidadeMaxima;
	
	public void ligar() {
		System.out.println("Carro ligado!");
	}
	
	public void acelerar(int taxa) {
		System.out.println("Acelerando!");
	}
	
	public void frear(int taxa) {
		System.out.println("Freando!!");
	}

}
