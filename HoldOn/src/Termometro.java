
public class Termometro {
	private int temperatura;
	private int constante = 5;
	
	public Termometro() {
		this.temperatura = 15;
	}
	public Termometro(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void aumentarTemperatura() {
		if(validarTemperatura(this.temperatura)) {
			this.temperatura += constante;
		}else {
			System.out.println("Operação Inválida!");
		}	
	}
	
	public void diminuirTemperatura() {
		if(validarTemperatura(this.temperatura)) {
			this.temperatura -= constante;
		}else {
			System.out.println("Operação Inválida!");
		}
	}
	
	public void getTemperatura() {
		System.out.println("Temperatura: " + temperatura + "Cº");
	}
	
	public boolean validarTemperatura(int temperatura) {
		if(temperatura >= -20 && temperatura <= 100) {
			return true;
		}else {
			return false;
		}
	}
}
