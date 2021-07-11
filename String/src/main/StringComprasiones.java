package main;

public class StringComprasiones {

	public static void main(String[] args) {
		
		String cadena1 = "Hola";
		String cadena2 = "Hola";
		
		 
		
		boolean resultado = cadena1.equals(cadena2);
		System.out.println(resultado);
		
		String nuevaCadena1 = cadena1.toUpperCase();
		String nuevaCadena2 = cadena2.toUpperCase();
		
		resultado = nuevaCadena1.equals(nuevaCadena2);
		System.out.println(resultado);

	}

}
