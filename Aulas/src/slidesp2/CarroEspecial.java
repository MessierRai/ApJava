package slidesp2;

public class CarroEspecial extends Carro {
	public CarroEspecial(String modelo, String marca) {
		super(modelo, marca);
	}
	
	@Override
	public void virar() {
		System.out.println("Virando!! \n Beep!");
	}

}
