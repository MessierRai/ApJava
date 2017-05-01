package CeV.exerciciospt1;

public class Main {

	public static void main(String[] args) {
		Pessoa dougras = new Pessoa("Dougras", 21, "Masculino");
		
		Livro ordinario = new Livro("Ordinario", "Peste, Caba da", 16, dougras);
		
		ordinario.detalhes();
		ordinario.abrir();
		ordinario.avancarPag();
		
		System.out.println(dougras.getIdade());
		dougras.fazerAniver();
		System.out.println(dougras.getIdade());
	}

}
