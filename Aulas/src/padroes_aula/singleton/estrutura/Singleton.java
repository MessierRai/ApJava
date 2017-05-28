package padroes_aula.singleton.estrutura;

public class Singleton {
	
	private static Singleton uniqueInstance = null;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton instance() {
		if(uniqueInstance == null) {
			return uniqueInstance = new Singleton();
		}else {
			return uniqueInstance;
		}
	}

}
