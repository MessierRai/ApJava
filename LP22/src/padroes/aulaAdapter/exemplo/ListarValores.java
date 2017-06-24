package padroes.aulaAdapter.exemplo;

// Cliente
public class ListarValores { // Contexto

	private int[] valores;
	
	public ListarValores() {
		valores = new int[5];
	}
	public void ordenar() {
		OrdenarTarget o = new OrdenarAdaper();
		valores = o.ordenar(valores);
	}
	public int[] getValores() {
		return this.valores;
	}
	public void setValores(int[] valores) {
		this.valores = valores;
	}
}
