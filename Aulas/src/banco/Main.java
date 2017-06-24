package banco;
// Disciplina - Aluno
// Pedido - Item
public class Main {

	public static void main(String[] args) {
		Conta c = new Conta("1234-5");
		
		try {
			c.deposito(-2);
			c.saque(45);
		} catch (SaqueException e) {
			System.out.println(e.getMessage());
		} catch (DepositoException e) {
			System.out.println(e.getMessage());
		}

	}

}
