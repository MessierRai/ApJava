package aula12_05.empresa;

public class Gerente extends Funcionario implements IdentificavelIF{

	@Override
	public void identificar() {
		System.out.println("Identificação biométrica!");		
	}

}
