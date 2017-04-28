package slidesp2.lista2;

public class Movimentacao {
	
	private String descricao;
	private double valorMov;
	private String tipoMov;
	
	public Movimentacao(String descricao, double valor, String tipo) {
		this.descricao = descricao;
		this.valorMov = valor;
		this.tipoMov = tipo;
	}
	
	public void mostrar() {
		System.out.println(this.descricao + " | " + this.valorMov + " | " + this.tipoMov);
	}

}
