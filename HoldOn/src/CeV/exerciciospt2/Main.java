package CeV.exerciciospt2;

public class Main {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 POO");
		v[1] = new Video("Aula 2 POO");
		v[2] = new Video("Aula 2 POO");
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
	}

}
