package padroes.strategy.exemplo;

import java.util.ArrayList;

public class ListaNomes {

	private ArrayList<String> nomes;
	private SortStrategy stragety;
	
	public ListaNomes() {
		nomes = new ArrayList<String>();
	}

	public ArrayList<String> getNomes() {
		return nomes;
	}

	public void addNome(String nome) {
		this.nomes.add(nome);
	}

	public void execute() {
		getStragety().algoritmo(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	public SortStrategy getStragety() {
		return stragety;
	}

	public void setStragety(SortStrategy stragety) {
		this.stragety = stragety;
	}
}
