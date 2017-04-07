package aula07_04.academico;

public class Professor extends User {
	
	public final static String ESPECIALIZACAO = "Especialização";
	public final static String MESTRADO = "Mestrado";
	public final static String DOUTORADO = "Doutorado";
	private String nivel;
	
	public Professor(String nome, String login, String senha, String nivel) {
		super(nome, login, senha);
		this.nivel = nivel;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		if (nivel.equals(ESPECIALIZACAO) || nivel.equals(MESTRADO) || nivel.equals(DOUTORADO)) {
			this.nivel = nivel;
		}
		
	}
	
}
