package garagem;

public class Carro {
	private String marca;
	private String modelo;
	private Motor motor;
	private float velocidade;
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor(1.6f);
	}
	
	public void Acelerar() {
		System.out.println("Acelerando...");
		this.velocidade = this.velocidade + motor.getPotencia();
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}

}
