package ar.edu.unlam.pb2;

public class Monitor {
	
	private final Integer idMonitor;
	protected String marca;
	protected Double tama�o;
	private static Integer contadorMonitores;
	
	private Monitor() {
		
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, Double i) {
		this ();
		this.marca = marca;
		this.tama�o = i;
	}
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public Double getTama�o() {
		return tama�o;
	}


	public void setTama�o(Double tama�o) {
		this.tama�o = tama�o;
	}
	
	

	public Integer getIdMonitor() {
		return idMonitor;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tama�o=" + tama�o + ", contadorMonitores="
				+ contadorMonitores + "]";
	}
	
	
	

}
