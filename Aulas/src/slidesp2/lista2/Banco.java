package slidesp2.lista2;

import java.util.ArrayList;

//há falhas em add contas, e na presença de 2 ou mais contas não é possivel instanciacão

public class Banco {
	private String nome;
	private ArrayList<ContaCorrente> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<ContaCorrente>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void criarConta(int numero, boolean especial, int limite) {
		this.contas.add(new ContaCorrente(numero, especial, limite));
		System.out.println("Conta criada com sucesso!");
		
	}
	
	public void fecharConta(int numero) {
		for(ContaCorrente cc1 : contas) {
			if(cc1.getNumero() == numero) {
				contas.remove(cc1);
				System.out.println("Conta removida com sucesso!");
			}
		}
	}
	
	public void listarContas() {
		for(ContaCorrente cc : this.contas) {
			System.out.println(cc.getNumero());
		}
	}

}
