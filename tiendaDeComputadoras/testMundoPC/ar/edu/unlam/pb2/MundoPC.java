package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.*;
@SuppressWarnings("unused")

public class MundoPC {

	public static void main(String[] args) {
		
		Monitor monitorHP= new Monitor("HP", 13.0);
		Teclado tecladoHP= new Teclado("bluetooth", "HP");
		Raton ratonHP= new Raton("bluetooth", "HP");
		Computadora computadoraHP= new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP );
		

		Monitor monitorGamer= new Monitor("Gamer", 34.0);
		Teclado tecladoGamer= new Teclado("bluetooth", "Gamer");
		Raton ratonGamer= new Raton("bluetooth", "Gamer");
		Computadora computadoraGamer= new Computadora("ComputadoraGamer", monitorGamer, tecladoGamer, ratonGamer );
		
		OrdenDeCompra orden1= new OrdenDeCompra();
		orden1.agregarComputadora(computadoraGamer);
		orden1.agregarComputadora(computadoraHP);
	}

}
