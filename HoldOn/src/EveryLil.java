
public class EveryLil {

	public static void main(String[] args) {
		EncapsuladorInt pp = new EncapsuladorInt(2);
		
		pp.imprimir();
		pp.setIncrementar(46);
		pp.imprimir();
		pp.setZerar();
		pp.imprimir();
		
		System.out.println("\n");
		
		Quadrado pp2 = new Quadrado(7);
		
		pp2.area();
		pp2.perimetro();
		
		System.out.println("\n");
		
		Termometro pp3 = new Termometro(95);
		
		pp3.getTemperatura();
		pp3.aumentarTemperatura();
		pp3.aumentarTemperatura();
		pp3.getTemperatura();
		/*pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura();
		pp3.diminuirTemperatura(); */
		pp3.getTemperatura();

	}

}
