package lp2_cabstratas.empresaID;

public class Vendedor 
    extends Funcionario 
    implements Identificavel {

	public void identificar() {
		System.out.println("Identificação textual!");
	}
}
