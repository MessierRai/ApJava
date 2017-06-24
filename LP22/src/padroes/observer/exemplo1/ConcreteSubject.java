package padroes.observer.exemplo1;

public class ConcreteSubject extends Subject {

	private String nome;
	private int valor;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		super.notificar();
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
		super.notificar();
	}

}
