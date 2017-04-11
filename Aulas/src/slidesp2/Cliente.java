package slidesp2;

import java.util.ArrayList;

public class Cliente {
	String nome;
	String cpf;
	String conta;

	ArrayList<String> arr = new ArrayList<String>();

	public void addConta(String newConta) {
		arr.add(newConta);
		System.out.println("Conta adicionada!");
	}

	public void remConta(String removeConta) {
		arr.remove(removeConta);
		System.out.println("Conta removida!");
	}
	
	public void listContas() {
		for(String contas: arr) {
			System.out.print(contas + " ");
		}
		System.out.println();
	}

}


