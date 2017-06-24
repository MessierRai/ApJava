package htl.bates.molde;

import java.util.ArrayList;

import htl.bates.excecoes.CapacidadeInvalidaException;

public class Apartamento {
	
	private int numero;
	private int capacidade;
	private Apartamento categoria;
	ArrayList<String> equip;
	private String status;
	
	public Apartamento(int numero, int capacidade) throws CapacidadeInvalidaException {
		this.numero = numero;
		this.setCapacidade(capacidade);
		this.equip = new ArrayList<>();
		
		this.equip.add("TV a Cabo");
		this.equip.add("Frigobar");
		this.equip.add("Serviço de quarto 24hrs");
		this.equip.add("Ducha com regulagem de temperatura");
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) throws CapacidadeInvalidaException{
		if(capacidade == 1 || capacidade == 2 || capacidade == 3) {
			this.capacidade = capacidade;
		} else {
			throw new CapacidadeInvalidaException();
		}
		
	}
	public Apartamento getCategoria() {
		return categoria;
	}
	public void setCategoria(Apartamento categoria) {
		this.categoria = categoria;
	}
	public ArrayList<String> getEquip() {
		return equip;
	}
	public void setEquip(String equip) {
		this.equip.add(equip);
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return this.getNumero() + " " + this.getStatus();
	}
}
