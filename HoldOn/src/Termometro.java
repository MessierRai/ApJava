
public class Termometro {
	private int temperatura;
	
	public Termometro() {
		this.temperatura = 15;
	}
	public Termometro(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void aumentarTemperatura() {
		this.temperatura += 5;
	}
	
	public void diminuirTemperatura() {
		this.temperatura -= 5;
	}
	
	public void getTemperatura() {
		System.out.println("Temperatura: " + temperatura + "Cº");
	}
}
