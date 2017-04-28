package CeV.relacionamentos;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, double peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}
	
	private void setCategoria() {
		if(getPeso() < 52.2) {
			this.categoria = "Inválido";
		}else {
			if(getPeso() <= 70.3) {
				this.categoria = "Leve";
			}else {
				if(getPeso() <= 83.9) {
					this.categoria = "Médio";
				}else {
					if(getPeso() <= 120.2) {
						this.categoria = "Pesado";
					}else {
						this.categoria = "Inválido";
					}
				}
			}
		}
	}
	
	public String getCategoria() {
		//System.out.println("Categoria de " + getNome() + ": " + this.categoria);
		return this.categoria;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public int getEmpates() {
		return this.empates;
	}
	
	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " Anos");
		System.out.println(getAltura() + "m de altura");
		System.out.println("Pesando: " + getPeso() + "Kg");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
		
	}
	
	public void status() {
		System.out.println(getNome());
		System.out.println("É um peso " + getCategoria());
		System.out.println(getVitorias() + " vitorias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
		
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
		
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
		
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

}
