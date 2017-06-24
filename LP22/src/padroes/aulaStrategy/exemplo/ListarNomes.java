package padroes.aulaStrategy.exemplo;

import java.util.ArrayList;

public class ListarNomes { // Contexto

	private ArrayList<String> nomes;
	private SortStrategy sortStrategy;
	
	public ListarNomes() {
		nomes = new ArrayList<String>();
		sortStrategy = new Bubblesort();
	}
	public ArrayList<String> getNomes() {
		return this.nomes;
	}
	public void ordenar() {
		sortStrategy.ordena(nomes);
	}
	public void addNome(String nome) {
		nomes.add(nome);
	}
	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
}
