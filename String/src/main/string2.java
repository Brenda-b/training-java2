package main;

public class string2 {

	public static void main(String[] args) {
		
		String mensaje = "";
		String intento = "pruebo un numero";
		
		float valor = 10.97546f;
		
		mensaje = String.format("%.2f segundo intento %s", valor , intento);
		
		
		System.out.println(mensaje);
		System.out.printf("%.2f segundo intento %s", valor , intento);
		

	
		
	}

}
