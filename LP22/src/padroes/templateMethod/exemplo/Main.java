package padroes.templateMethod.exemplo;

public class Main {

	public static void main(String[] args) {
		Compilador javac = new CompiladorJava();
		javac.compilador();
		
		Compilador gcc = new CompiladorC();
		gcc.compilador();
	}

}
