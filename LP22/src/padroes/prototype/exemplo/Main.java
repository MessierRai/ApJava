package padroes.prototype.exemplo;

public class Main {

	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.setNome("Jose");
		a.setIdade(20);
		
		Pessoa b = (Pessoa) a.clonar();
		
		System.out.println(a.getNome());
		System.out.println(a.getIdade());

		System.out.println(b.getNome());
		System.out.println(b.getIdade());
		
		b.setNome("Maria");
		b.setIdade(22);

		System.out.println(a.getNome());
		System.out.println(a.getIdade());
		
		System.out.println(b.getNome());
		System.out.println(b.getIdade());
		
	}

}
