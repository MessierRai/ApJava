import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		int segsDado = tec.nextInt();
		
		int hrs = segsDado / 3600;
		int hrsRs = segsDado % 3600;
		
		
		int mins = hrsRs / 60;
		int minsRs = hrsRs % 60;
		
		System.out.println(hrs + ":" + mins + ":" + minsRs);
		
		
	}

}
