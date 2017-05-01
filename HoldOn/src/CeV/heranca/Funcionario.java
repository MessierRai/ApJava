package CeV.heranca;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}

	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return this.trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void mudarTrabalho() {
		if(this.getTrabalhando()) {
			this.setTrabalhando(false);
		}else {
			this.setTrabalhando(true);
		}
	}
	
}
