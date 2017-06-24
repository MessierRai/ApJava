package padroes.aula.singleton.estrutura;

public class Singleton {

	private static Singleton uniqueInstance = null;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton instance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}
