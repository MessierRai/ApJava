package aula07_04.academico;

public class Disciplina {
	
	private String codigo;
	private String titulo;
	private Professor professor;
	
	public Disciplina(String codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}
	
	public Disciplina(String codigo, String titulo, Professor professor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.professor = professor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
