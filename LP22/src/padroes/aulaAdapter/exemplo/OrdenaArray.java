package padroes.aulaAdapter.exemplo;

import java.util.ArrayList;

// Adaptee
public class OrdenaArray {

	public ArrayList<Integer> ordenar(ArrayList<Integer> valores) {
		ArrayList<Integer> temporario = (ArrayList<Integer>) valores.clone();
		for (int i = 0; i < temporario.size() - 1; i++) {
			for (int k = i + 1; k < temporario.size(); k++) {
			  // Compare left to right, not right to left.
			  if (temporario.get(i) > temporario.get(k)) {
			  	Integer temp = temporario.get(i);
			  	temporario.set(i, temporario.get(k));
			  	temporario.set(k, temp);
			  }
			}
		}
		return temporario;
	}

}
