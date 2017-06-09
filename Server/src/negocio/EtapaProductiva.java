package src.negocio;

public class EtapaProductiva {
	private AreaProductiva areaProductiva;
	private int tiempoProduccion;
	private int orden;
	
	public EtapaProductiva(){}

	public AreaProductiva getAreaProductiva() {
		return areaProductiva;
	}

	public void setAreaProductiva(AreaProductiva areaProductiva) {
		this.areaProductiva = areaProductiva;
	}

	public int getTiempoProduccion() {
		return tiempoProduccion;
	}

	public void setTiempoProduccion(int tiempoProduccion) {
		this.tiempoProduccion = tiempoProduccion;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	

}
