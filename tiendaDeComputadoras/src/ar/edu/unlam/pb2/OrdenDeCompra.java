package ar.edu.unlam.pb2;

public class OrdenDeCompra {
	
	private final Integer idOrden;
	private Computadora computadoras[];
	private static Integer contadorOrdenes;
	private  Integer contadorComputadoras;
	private static final Integer MAX_COMPUTADORAS = 10;
	
	
	
	protected OrdenDeCompra() {
		
		this.idOrden = ++OrdenDeCompra.contadorOrdenes;
		
		computadoras = new Computadora[OrdenDeCompra.MAX_COMPUTADORAS];
		
		}
	
	public void agregarComputadora(Computadora computadora) {
		
		if (this.contadorComputadoras < OrdenDeCompra.MAX_COMPUTADORAS) {
			
			this.computadoras[this.contadorComputadoras++] = computadora;
		}
		
		else {
			
			System.out.print("Superaste el limite: "+ OrdenDeCompra.MAX_COMPUTADORAS);
		}
		
	}
	
	
	
	
	public void mostrarOrden() {
		
		
		
		System.out.println("Orden #: "+ this.idOrden);
		System.out.println("Computadoras de la orden #: " + this.idOrden);
		
		for	(Integer i = 0; i < this.contadorComputadoras; i++) {
			
			System.out.println(this.computadoras[i]);
		}
	}
}
