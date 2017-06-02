package AppJavaFX;

import javafx.beans.property.SimpleStringProperty;

public class Contato {
	private SimpleStringProperty nome;
	private SimpleStringProperty sobrenome;
	private SimpleStringProperty email;
	
	public Contato() {
		this.nome = new SimpleStringProperty("");
		this.sobrenome = new SimpleStringProperty("");
		this.email = new SimpleStringProperty("");
	}
	
	public Contato(String nome, String sobrenome, String email) {
		this.nome = new SimpleStringProperty(nome);
		this.sobrenome = new SimpleStringProperty(sobrenome);
		this.email = new SimpleStringProperty(email);
	}

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getSobrenome() {
		return this.sobrenome.get();
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome.set(sobrenome);
	}

	public String getEmail() {
		return this.email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}
	

}
