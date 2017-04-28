package CeV.relacionamentos;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	
	public void lutar() {
		if(this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			int vencedor = 1;
			switch(vencedor) {
				case 0:
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
				case 1:
					System.out.println(this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
				case 2:
					System.out.println(this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
			}
		}else {
			System.out.println("Luta não pode acontecer!");
		}
		
	}

}
