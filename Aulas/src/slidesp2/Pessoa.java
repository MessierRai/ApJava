package slidesp2;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	private int matricula;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if(validarMatricula(this.matricula)) {
			this.matricula = matricula;
		}else {
			System.out.println("Número de matricula inválida!");
		}
	}
	
	public boolean validarMatricula(int matricula) {
		if(this.matricula > 0){
			return true;
		}else {
			return false;
		}
	}

}
