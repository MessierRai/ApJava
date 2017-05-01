package provafakelp2.primeira;

public class Interruptor {
	
	private Lampada l1;
	
	public Interruptor(Lampada l1) {
		this.l1 = l1;
	}
	
	public void acender() {
		if(this.l1.getStatus()) {
			System.out.println("Lampada ja ligada. \n");
		}else {
			this.l1.setStatus(true);
			System.out.println("Lampada Ligada \n");
		}
	}
	
	public void apagar() {
		if(this.l1.getStatus()) {
			this.l1.setStatus(false);
			System.out.println("Lampada Desligada \n");
		}else {
			System.out.println("Lampada já apagada. \n");
		}
	}
	
	public void obterEstado() {
		if(this.l1.getStatus()) {
			System.out.println("A lampada está ligada! \n");
		}else {
			System.out.println("A lampada está desligada! \n");
		}
	}

}
