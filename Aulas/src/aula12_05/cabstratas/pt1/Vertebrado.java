package aula12_05.cabstratas.pt1;

public abstract class Vertebrado extends Animal {
	
	private int qtdOssos;
	
	public int getQtdOssos() {
		return qtdOssos;
	}

	public void setQtdOssos(int qtdOssos) {
		this.qtdOssos = qtdOssos;
	}

	@Override
	public void respirar() {
		System.out.println("Respirando usando os pulmoes");
	}

}
