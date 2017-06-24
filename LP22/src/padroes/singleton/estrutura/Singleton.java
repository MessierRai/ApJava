package padroes.singleton.estrutura;

public class Singleton {

	private static Singleton uniqueInstance = null;

	private Singleton () { }

	public static synchronized Singleton Instance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
