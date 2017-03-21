
public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public void area() {
		double areaQuadrado = this.lado * this.lado;
		System.out.println("A Área do quadrado é " + areaQuadrado + " u.a.");
	}
	
	public void perimetro() {
		double perimetroQuadrado = this.lado * 4;
		System.out.println("O perimetro do quadrado é de " + perimetroQuadrado + " u.a.");
	}
}
