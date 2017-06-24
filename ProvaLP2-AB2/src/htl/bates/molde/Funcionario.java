package htl.bates.molde;

import htl.bates.excecoes.HoraTrabalhoNegativoException;
import htl.bates.excecoes.TotalHorasTrabalhoException;

public class Funcionario extends Pessoa {
	
	private int numCT;
	private double valorHoraTr;
	
	
	public int getNumCT() {
		return numCT;
	}
	public void setNumCT(int numCT) {
		this.numCT = numCT;
	}
	public double getValorHoraTr() {
		return valorHoraTr;
	}
	public void setValorHoraTr(double valorHoraTr) throws HoraTrabalhoNegativoException{
		if(valorHoraTr < 0) {
			throw new HoraTrabalhoNegativoException();
		}
		this.valorHoraTr = valorHoraTr;
	}
	
	public double calcularSalario(int numHoras) throws TotalHorasTrabalhoException{
		if(numHoras < 0) {
			throw new TotalHorasTrabalhoException();
		}else {
			return numHoras * this.getValorHoraTr();
		}
	}
	
	public Funcionario clonar() {
		return new Funcionario();
	}

}
