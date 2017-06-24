package lp2_cabstratas.empresaID;

public class Gerente 
    extends Funcionario 
    implements Identificavel {

	public void identificar() {
		System.out.println("Identificação biométrica!");
	}
	
}
