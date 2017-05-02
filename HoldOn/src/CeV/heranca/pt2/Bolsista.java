package CeV.heranca.pt2;

public class Bolsista extends Aluno {
	
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa d@ " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista, pagamento facilitado!");
	}

	public int getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
