package padroes.singleton.exemplo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrinterMgrSingleton {

	private static PrinterMgrSingleton uniqueInstance = null;
	
	private ArrayList<String> fila;

	private PrinterMgrSingleton () {
		this.fila = new ArrayList<String>();
	}

	public static synchronized PrinterMgrSingleton Instance() {
		if (uniqueInstance == null) {
			uniqueInstance = new PrinterMgrSingleton();
		}
		return uniqueInstance;
	}
	
	public void print(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void adicionarDocumento(String documento) {
		fila.add(documento);
	}

	public void filaDeImpressao() {
		String s = "================= \n";
		s = s + "Fila de impressão \n";
		s = s + "================= \n";
		for (int i = 0; i < fila.size(); i++) {
			s = s + (i+1) + " " + fila.get(i) + "\n";
		}
		s = s + "================= \n";
		print(s);
	}

	public void imprimir() {
		int opc = 0;
		do {
			if (fila.size() > 0) {
				print("imprimindo: " + fila.get(0));
				fila.remove(0);
				filaDeImpressao();
				opc = JOptionPane.showConfirmDialog(null, "Imprimir próximo?");
			}
		} while (opc == 0 && fila.size() > 0);
	}

}
