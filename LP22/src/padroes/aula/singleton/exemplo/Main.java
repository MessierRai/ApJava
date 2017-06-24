package padroes.aula.singleton.exemplo;

public class Main {

	public static void main(String[] args) {
		PrtMgrSingleton printer1 = PrtMgrSingleton.instance();
		PrtMgrSingleton printer2 = PrtMgrSingleton.instance();
		printer1.verFila();
		
		printer1.adicionarDocumento("boleto.pdf");
		printer2.adicionarDocumento("texto.pdf");
		printer1.adicionarDocumento("apostila.pdf");
		printer2.adicionarDocumento("resumo.pdf");
		printer1.verFila();
		
		printer1.imprimir();
		printer1.verFila();
	}

}
