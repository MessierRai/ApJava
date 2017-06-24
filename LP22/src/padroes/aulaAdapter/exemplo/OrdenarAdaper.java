package padroes.aulaAdapter.exemplo;

import java.util.ArrayList;

public class OrdenarAdaper implements OrdenarTarget {

	public int[] ordenar(int[] valores) {
		OrdenaArray o = new OrdenaArray();
		// adaptacao 1
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < valores.length; i++) {
			lista.add(valores[i]);
		}
		ArrayList<Integer> ret = o.ordenar(lista);
		int[] temp = new int[ret.size()];
		// adaptacao 2
		for (int i = 0; i < ret.size(); i++) {
			temp[i] = ret.get(i);
		}
		return temp;
	}
	
}
