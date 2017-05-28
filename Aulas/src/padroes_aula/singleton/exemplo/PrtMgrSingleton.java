package padroes_aula.singleton.exemplo;

import java.util.ArrayList;

public class PrtMgrSingleton {
	private static PrtMgrSingleton uniqueInstance = null;
	private ArrayList<String> fila;

	
	private PrtMgrSingleton() {
		this.fila = new ArrayList<String>();
		
	}
	
	public static synchronized PrtMgrSingleton instance() {
		if(uniqueInstance == null) {
			return uniqueInstance = new PrtMgrSingleton();
		}else {
			return uniqueInstance;
		}
	}
	
	public void adicionarDocumento(String documento) {
		this.fila.add(documento);
	}
	
	public void verFila() {
		int i = 1;
		for(String documento : fila) {
			System.out.println(i + " " + documento);
		}
	}
	
	public void imprimir() {
		if(this.fila.size() > 0) {
			String d = this.fila.get(0);
			System.out.println("Imprimindo... " + d);
			this.fila.remove(0);
		}
	}

}
