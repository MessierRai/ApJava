package CeV.heranca.pt2;

public class Tecnico extends Aluno {
	
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("Tecnic@ " + this.getNome() + " praticando!!");
	}

	public int getRegistroProfissional() {
		return this.registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	

}
