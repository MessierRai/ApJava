package padroes.strategy.exemplo;

import java.util.ArrayList;

public class InsertSort extends SortStrategy {

	public void algoritmo(ArrayList<String> nomes) {
		int i,j;
		String key;
		for (j=1; j<nomes.size(); j++) {
			key = nomes.get(j);
			i = j - 1;
			while (i >= 0)
			{
				if (key.compareTo(nomes.get(i)) > 0) {
					break;
				}
				String element=nomes.get(i+1);             //here
				nomes.set(i+1,nomes.get(i));          //here
				nomes.set(i,element);                      //here
				i--;
			}
			key=nomes.get(i+1);
		}
	}
}
