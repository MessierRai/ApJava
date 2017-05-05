package bighungryeyes;

public class Contato {
	
	private String telefoneResid;
	private String celular;
	private String email;
	
	public Contato(String telefoneResid, String celular, String email) {
		this.telefoneResid = telefoneResid;
		this.celular = celular;
		this.email = email;
	}

	public String getTelefoneResid() {
		return this.telefoneResid;
	}

	public void setTelefoneResid(String telefoneResid) {
		this.telefoneResid = telefoneResid;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
