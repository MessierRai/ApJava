package padroes.aulaPrototype;

public class Main {

	public static void main(String[] args) {
		Pessoa a = new Pessoa("Maria", 20);
		Pessoa b = (Pessoa) a.clonar();

		System.out.println(a.getNome() + " " + a.getIdade());
		System.out.println(b.getNome() + " " + b.getIdade());
		
		b.setNome("Ana Maria");
		b.setIdade(21);
		
		System.out.println(a.getNome() + " " + a.getIdade());
		System.out.println(b.getNome() + " " + b.getIdade());		
		
	}

}

