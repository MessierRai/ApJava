package oito;

public class Main {

	public static void main(String[] args) {
		Produto laranja = new Produto("Laranja", 1.76);
		Produto banana = new Produto("Banana", 0.72);
		Produto manga = new Produto("Manga", 1.05);
		
		Item i1 = new Item(laranja, 4);
		Item i2 = new Item(banana, 7);
		Item i3 = new Item(manga, 4);
		
		
		Compra c1 = new Compra();
		
		c1.addProduto(i1);
		c1.addProduto(i2);
		c1.addProduto(i3);
		
		//c1.listarProdutos();
		
		//c1.rmProduto(i2);
		//System.out.println();
		//c1.listarProdutos();
		c1.mostrar();
	}

}
