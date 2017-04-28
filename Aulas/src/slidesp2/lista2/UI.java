package slidesp2.lista2;

public class UI {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ordinario", 67);
		
		System.out.println(f1.getNome());
		System.out.println();
		
		ContaCorrente cc1 = new ContaCorrente(17, false, 8000);
		
		System.out.println(cc1.getSaldo());
		cc1.deposito(874.76);
		System.out.println(cc1.getSaldo());
		cc1.saque(56.62);
		System.out.println(cc1.getSaldo());
		cc1.deposito(-86.87);
		System.out.println(cc1.getSaldo());
		cc1.saque(900);
		System.out.println(cc1.getSaldo());
		cc1.alterarLimite(16000);
		System.out.println(cc1.getSaldo());
		System.out.println();
		
		cc1.extrato();
		
	}

}
