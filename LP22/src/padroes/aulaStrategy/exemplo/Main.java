package padroes.aulaStrategy.exemplo;

public class Main {

	public static void main(String[] args) {
		ListarNomes lista = new ListarNomes();
		lista.addNome("Maria");
		lista.addNome("José");
		lista.addNome("Pedro");
		lista.addNome("Teresa");
		lista.addNome("Adão");
		lista.addNome("Eva");
		
		for (String nome : lista.getNomes()) {
			System.out.println(nome);
		}
		//lista.setSortStrategy(new InsertSort());
		lista.ordenar();
		for (String nome : lista.getNomes()) {
			System.out.println(nome);
		}
	}

}
