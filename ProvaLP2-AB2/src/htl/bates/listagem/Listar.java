package htl.bates.listagem;

import htl.bates.cadastro.Cadastro;
import htl.bates.molde.Apartamento;
import htl.bates.molde.Funcionario;
import htl.bates.molde.Hospede;

public class Listar {
	
	public void listFunc() {
		for(Funcionario fc : new Cadastro().getFunc()) {
			System.out.println(fc.getNome());
		}
	}
	
	public void listHosp() {
		for(Hospede hsp : new Cadastro().getHosp()) {
			System.out.println(hsp.getNome());
		}
	}
	
	public void listApart() {
		for(Apartamento apt : new Cadastro().getApart()) {
			System.out.println(apt.toString());
		}
	}

}
