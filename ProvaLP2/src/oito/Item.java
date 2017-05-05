package oito;

public class Item {
	
	private Produto produto;
	private double valorTot;
	private int quantidade;
	
	public Item(Produto p, int qtd) {
		this.produto = p;
		this.quantidade = qtd;
	}
	
	public double getValorTot() { //ao ser chamado clacula o valor total do item e retorna esse valor
		this.setValorTot();
		return this.valorTot;
	}

	public void setValorTot() {
		this.valorTot = this.produto.getPreco() * this.quantidade;
	}

	public String getProduto() {
		return this.produto.getNome();
	}
	
	public double pUnit() { //retorna preco unitario do produto
		return this.produto.getPreco();
	}

	public int getQuantidade() {
		return quantidade;
	}

}
