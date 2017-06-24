package htl.bates.molde;

import htl.bates.excecoes.CapacidadeInvalidaException;

public class Luxo extends Apartamento {
	
	@SuppressWarnings("unused")
	private int valor;

	public Luxo(int numero, int capacidade) throws CapacidadeInvalidaException {
		super(numero, capacidade);
		this.valor = 400;
		
		this.equip.add("Ar refrigerado");
		this.equip.add("Banheira com hidromassagem");
	}
	
	

}
