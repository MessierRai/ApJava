package padroes.singleton.exemplo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// PrinterMgrSingleton printer = new PrinterMgrSingleton();
		PrinterMgrSingleton printer = PrinterMgrSingleton.Instance();
		
		int opc = 0;
		do {
			String documento = JOptionPane.showInputDialog("Documento");
			printer.adicionarDocumento(documento);
			// 0 = sim   1 = nao   2 = cancelar 
			opc = JOptionPane.showConfirmDialog(null, "Adicionar novo documento?");
		} while (opc == 0);

		printer.imprimir();
	}

}
