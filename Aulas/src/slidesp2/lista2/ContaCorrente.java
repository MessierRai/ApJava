package slidesp2.lista2;

import java.util.ArrayList;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private boolean especial;
	private int limite;
	private ArrayList<Movimentacao> moves;
	
	public ContaCorrente(int numero, boolean especial, int limite) {
		this.numero = numero;
		this.saldo = 0.0;
		this.especial = especial;
		this.limite = limite;
		this.moves = new ArrayList<Movimentacao>();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getEspecial() {
		return this.especial;
	}
	
	public int getLimite() {
		return this.limite;
	}
	
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void saque(double valor) {
		if(validaSaque(valor)) {
			setSaldo(getSaldo() - valor);
			Movimentacao mAt = new Movimentacao("Saque", valor, "Debito");
			this.moves.add(mAt);
		}else {
			System.out.println("Saque: Valor inválido!");
		}
	}
	
	public void deposito(double valor) {
		if(validaDeposito(valor)) {
			setSaldo(getSaldo() + valor);
			Movimentacao mAt = new Movimentacao("Deposito", valor, "Credito");
			this.moves.add(mAt);
		}else {
			System.out.println("Depósito: Valor inválido!");
		}
	}
	
	public boolean validaSaque(double valor) {
		if(getSaldo() >= valor && valor > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validaDeposito(double valor) {
		if(valor > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void alterarLimite(int valor) {
		if(valor > 0) {
			setLimite(valor);
			Movimentacao mAt = new Movimentacao("Alteracao de Limite", valor, "AltLim");
			this.moves.add(mAt);
		}else {
			System.out.println("Alterar Limite: Valor inválido!");
		}
	}
	
	public void extrato() {
		System.out.println("###Extrato conta num. " + getNumero() + " ###");
		for(Movimentacao mv : moves) {
			mv.mostrar();
		}
	}

}
