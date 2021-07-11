package main;

public class string {

	public static void main(String[] args) {
		
		String mensaje = "aca va el primer string";
		String mensaje2 = new String("texto");
		
		int cantidad = mensaje.length();
		boolean contiene = mensaje.contains("aca");
		boolean empiezaCon= mensaje.startsWith("aca");
		boolean terminaCon= mensaje.endsWith("string");
		
		String nuevoString = mensaje.concat(", ahora le agrego palabras");
		
		
		System.out.println(mensaje.toUpperCase()); //todo en mayusculas
		System.out.println(mensaje.toLowerCase());//todo en minusculas
		System.out.println(mensaje.trim());//elimina los espacios que tienen los textos. tanto al incio como al final
		
		
		
		System.out.println(mensaje2);
		
		System.out.println(cantidad);
		System.out.println(contiene);
		System.out.println(empiezaCon);
		System.out.println(terminaCon);
		System.out.println(mensaje);
		System.out.println(nuevoString);
	}

}
