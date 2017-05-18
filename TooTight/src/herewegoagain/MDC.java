package herewegoagain;

public class MDC {
	
	public static void mdc(int a, int b) {
		if(a % b == 0) {
			System.out.println(a);
		}else if(a % b == 1) {
			System.out.println("São relativamente primos.");
		}else {
			a = b;
			b = a % b;
			mdc(a, b);
		}
	}
	
	public static void main(String[] args) {
		mdc(38,9);
	}

}
