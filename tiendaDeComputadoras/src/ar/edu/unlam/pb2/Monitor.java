package ar.edu.unlam.pb2;

public class Monitor {
	
	private final Integer idMonitor;
	protected String marca;
	protected Double tamaño;
	private static Integer contadorMonitores;
	
	private Monitor() {
		
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, Double i) {
		this ();
		this.marca = marca;
		this.tamaño = i;
	}
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public Double getTamaño() {
		return tamaño;
	}


	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}
	
	

	public Integer getIdMonitor() {
		return idMonitor;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + ", contadorMonitores="
				+ contadorMonitores + "]";
	}
	
	
	

}
