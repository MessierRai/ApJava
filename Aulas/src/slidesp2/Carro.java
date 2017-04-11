package slidesp2;

public class Carro {
	private String modelo;
	private String marca;
	
	public Carro(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public void andar() {
		System.out.println("Andando!");
	}
	
	public void virar() {
		System.out.println("Virando");
	}
	public void parar() {
		System.out.println("Parando");
	}

}
