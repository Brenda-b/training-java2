package ar.edu.unlam.pb2;

public class Computadora {
	
	private final Integer idComputadora;
	private String nombre;
	private Raton raton;
	private Teclado teclado;
	private Monitor monitor;
	private static Integer contadorComputadoras;
	
	private Computadora() {
		
		this.idComputadora = ++Computadora.contadorComputadoras;
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		
		this();
		
		this.nombre= nombre;
		this.monitor=  monitor;
		this.teclado= teclado;
		this.raton= raton;
		}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", raton=" + raton + ", teclado="
				+ teclado + ", monitor=" + monitor + "]";
	}

	public Integer getIdComputadora() {
		return idComputadora;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	

}
