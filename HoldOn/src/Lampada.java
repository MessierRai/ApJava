
public class Lampada {
	@SuppressWarnings("unused")
	private String model;
	private boolean state;
	
	public boolean getState() {
		return state;
	}
	public void turnOn() {
		this.state = true;
	}
	public void turnOff() {
		this.state = false;
	}
}
