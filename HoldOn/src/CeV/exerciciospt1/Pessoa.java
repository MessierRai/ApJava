package CeV.exerciciospt1;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade =  idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	private void setIdade() {
		this.idade++;
	}
	
	public void fazerAniver() {
		this.setIdade();
	}

}
