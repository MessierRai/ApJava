package dp.adapter;

public class Main {

	public static void main(String[] args) {
		
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		PlugAmericano plugEUA = new PlugAmericano();
		
		AdapterEUAtoBrasil adaptee = new AdapterEUAtoBrasil();
		
		System.out.println(adaptee.conecta(plugEUA));

	}

}
