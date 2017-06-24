package padroes.strategy.exemplo;

import java.util.ArrayList;

public class Bubblesort extends SortStrategy {

	public void algoritmo(ArrayList<String> nomes) {
		for (int i = 0; i < nomes.size() - 1; i++) {
			for (int k = i + 1; k < nomes.size(); k++) {
				// Compare left to right, not right to left.
				if (nomes.get(i).compareToIgnoreCase(nomes.get(k)) > 0) {
					String temp = nomes.get(i);
					nomes.set(i, nomes.get(k));
					nomes.set(k, temp);
				}
			}
		}
	}

}
