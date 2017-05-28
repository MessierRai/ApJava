package padroes_aula.templateMethod.estrutura;

import java.util.Scanner;

public class CompiladorC extends Compilador {
	
	private String codigoFonte;

	@Override
	public void setCodigo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Codigo Fonte:");
		this.codigoFonte = sc.nextLine();
	}

	@Override
	public void compile() {
		if(this.codigoFonte.contains("main")) {
			System.out.println("Compilado com sucesso!");
		}else {
			System.out.println("Erro ao compilar!");
		}
	}

	@Override
	public void execute() {
		System.out.println("Olá mundo!");
	}

}
