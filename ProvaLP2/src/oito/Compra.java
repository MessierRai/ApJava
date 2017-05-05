package oito;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Item> items;
	@SuppressWarnings("unused")
	private double valorTot;
	
	public Compra() {
		this.valorTot = 0;
		items = new ArrayList<Item>();
	}
	
	public void addProduto(Item item) {
		this.items.add(item);
	}
	
	public void rmProduto(Item item) {
		this.items.remove(item);
	}
	
	public void listarProdutos() { // retorna os nomes dos produtos na lista de items
		for(Item p : this.items) {
			System.out.println(p.getProduto());
		}
	}
	
	public double getValorTot() { //percorre a lista de items somando seus valores;
		double tmp = 0.0;
		for(Item n : this.items) {
			tmp = tmp + n.getValorTot();
		}
		this.valorTot = tmp;
		return tmp;
	}
	
	public void mostrar() {
		System.out.println("Produto    Valor Unitario     Quantidade    Valor Parcial");
		for(Item i : this.items) {
			System.out.print(i.getProduto() + "   ");
			System.out.print("R$ " + i.pUnit() + "    " + i.getQuantidade() + "    " + "R$ " + i.getValorTot() + "\n");
		}
		System.out.println("Valor total......................................R$ " + this.getValorTot());
	}


}
