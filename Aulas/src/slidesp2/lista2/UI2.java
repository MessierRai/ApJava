package slidesp2.lista2;

public class UI2 {

	public static void main(String[] args) {
		Banco b1 = new Banco("Ordinaris");
		System.out.println(b1.getNome());

		ContaCorrente xcc = b1.criarConta(17, false, 2000);
		ContaCorrente xcc1 = b1.criarConta(82, false, 2000);
		ContaCorrente xcc2 = b1.criarConta(46, false, 2000);
				
		
		b1.listarContas();
		
	}

}
