package CeV.polimorfismo;

public class Peixe extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadar");
	}

	@Override
	public void alimentar() {
		System.out.println("Comida de Peixe");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de peixe kkkkkkhuehuehue");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}

}
