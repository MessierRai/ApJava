package htl.bates.cadastro;

import java.util.ArrayList;

import htl.bates.molde.Apartamento;
import htl.bates.molde.Funcionario;
import htl.bates.molde.Hospede;

public class Cadastro {
	
	public ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();
	public ArrayList<Hospede> hospList = new ArrayList<Hospede>();
	public ArrayList<Apartamento> apartList =  new ArrayList<Apartamento>();

	public void cadFunc(Funcionario func) {
		this.funcList.add(func);
	}
	
	public void cadHosp(Hospede hosp) {
		this.hospList.add(hosp);
	}
	
	public void cadApart(Apartamento apart) {
		this.apartList.add(apart);
	}
	
	public ArrayList<Funcionario> getFunc() {
		return this.funcList;
	}
	
	public ArrayList<Hospede> getHosp() {
		return this.hospList;
	}
	
	public ArrayList<Apartamento> getApart() {
		return this.apartList;
	}

}
