package slidesp2.poli;

public class Main {

	public static void main(String[] args) {
		Personagem king = new Rei();
		king.setArma(new Espada());
		king.lutar();
		
		Personagem queen = new Rainha();
		queen.setArma(new Faca());
		queen.lutar();
		
		Personagem knight = new Cavaleiro();
		knight.setArma(new Arco());
		knight.lutar();
		
	}

}
