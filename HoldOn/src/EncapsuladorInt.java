
public class EncapsuladorInt {
	private int qualquer;

	public EncapsuladorInt(int qualquer) {
		this.qualquer = qualquer;
	}

	public void imprimir() {
		System.out.println("O valor atual de 'Qualquer' é: " + qualquer);
	}

	public void setZerar() {
		//this.qualquer = qualquer;
		qualquer = 0;
	}
	
	public void setIncrementar(int qualquer) {
		//this.qualquer = qualquer;
		this.qualquer += qualquer;
	}

}
