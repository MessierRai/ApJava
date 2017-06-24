package dp.adapter;

public class TomadaAmericana extends Tomada {
	
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	@Override
	public String getNomeRede() {
		return "tomada americana";
	}

}
