package slidesp2;

import java.util.ArrayList;

public class Agenda {
	ArrayList<String> pessoas;
	
	public void inserirPessoa(String pessoa) {
		pessoas.add(pessoa);
		System.out.println("Pessoa adicionada!");
	}
	
	public void removerPessoa(String pessoa) {
		pessoas.remove(pessoa);
		System.out.println("Pessoa removida!");
	}
	
	public void imprimirAgenda() {
		for(String p:pessoas) {
			System.out.println(p);
		}
	}

}
