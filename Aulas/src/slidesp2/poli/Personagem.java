package slidesp2.poli;

public abstract class Personagem {
	
	private Arma Armar;
	
	public void setArma(Arma arma) {
		this.Armar = arma;
	}
	
	public abstract void lutar();

}
