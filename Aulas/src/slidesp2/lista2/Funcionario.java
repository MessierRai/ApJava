package slidesp2.lista2;

public class Funcionario {
	private String nome;
	private int id;
	
	public Funcionario(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
