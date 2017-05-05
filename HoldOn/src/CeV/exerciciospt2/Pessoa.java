package CeV.exerciciospt2;

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getExperiencia() {
		return this.experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	public int getIdade() {
		return this.idade;
	}
	
	protected void ganharExp() {
		this.setExperiencia(this.getExperiencia() + 0.1f);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
	

}
