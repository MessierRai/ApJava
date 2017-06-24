package htl.bates.molde;

import htl.bates.excecoes.CapacidadeInvalidaException;

public class Executivo extends Apartamento {
	
	@SuppressWarnings("unused")
	private int valor;

	public Executivo(int numero, int capacidade) throws CapacidadeInvalidaException {
		super(numero, capacidade);
		this.valor = 300;
		
		this.equip.add("Ar refrigerado");
	}

}
