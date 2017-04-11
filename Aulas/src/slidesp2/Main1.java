package slidesp2;

public class Main1 {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.addConta("456-0");
		c1.addConta("347-6");
		c1.addConta("249-1");
		c1.listContas();
		c1.remConta("456-0");
		c1.listContas();
	}

}
