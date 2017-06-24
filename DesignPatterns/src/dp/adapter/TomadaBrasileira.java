package dp.adapter;

public class TomadaBrasileira extends Tomada {
	
	
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	@Override
	public String getNomeRede() {
		return " tomada brasileira";
	}

}
