
public class Termometro {
	private int temperatura;
	
	public Termometro() {
		this.temperatura = 15;
	}
	public Termometro(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void aumentarTemperatura() {
		if(validarTemperatura()) {
			this.temperatura += 5;
		}else {
			System.out.println("Operação Inválida!");
		}	
	}
	
	public void diminuirTemperatura() {
		if(validarTemperatura()) {
			this.temperatura -= 5;
		}else {
			System.out.println("Operação Inválida!");
		}
	}
	
	public void getTemperatura() {
		System.out.println("Temperatura: " + temperatura + "Cº");
	}
	
	public boolean validarTemperatura() {
		if(this.temperatura >= -20 && this.temperatura <= 100) {
			return true;
		}else {
			return false;
		}
	}
}
