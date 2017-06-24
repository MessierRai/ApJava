package htl.bates.molde;

import htl.bates.excecoes.CapacidadeInvalidaException;

public class Standard extends Apartamento {
	

	@SuppressWarnings("unused")
	private int valor;

	public Standard(int numero, int capacidade) throws CapacidadeInvalidaException {
		super(numero, capacidade);
		this.valor = 200;
		
		this.equip.add("Ventilador de Teto");
	}

}
