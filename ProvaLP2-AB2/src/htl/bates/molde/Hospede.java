package htl.bates.molde;

import htl.bates.excecoes.TipoErradoException;

public class Hospede extends Pessoa {
	
	private String cidadeResidencia;
	private String tipo;
	private int numHosp = 0;
	
	
	public String getCidadeResidencia() {
		return cidadeResidencia;
	}
	public void setCidadeResidencia(String cidadeResidencia) {
		this.cidadeResidencia = cidadeResidencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) throws TipoErradoException{
		if(tipo.equals("normal") || tipo.equals("vip")) {
			this.tipo = tipo;
		}else {
			throw new TipoErradoException();
		}
		
	}
	public int getNumHosp() {
		return numHosp;
	}
	public void setNumHosp() {
		if(this.numHosp >= 5) { // verifica se o numero de hospedagem é maior/igual a 5
		}
		this.numHosp++;
	}
	
	public Hospede clonar() {
		return new Hospede();
	}

}
