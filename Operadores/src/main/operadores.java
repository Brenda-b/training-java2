package main;

public class operadores {

	public static void main(String[] args) {
	
		int variableX = 50, variableY = 10;
		float variableZ = 5.5f;
		int resultado;
		boolean resultadoV;
		resultado = variableX + variableY;
		System.out.println(resultado);
		
		int resultado2 = variableX - variableY;
		System.out.println(resultado2);
		
		resultado= variableX + (int) variableZ;
		System.out.println(resultado);
		
		variableX++;
		
		resultadoV= variableX < variableZ;
		System.out.println(resultadoV);
		 
	}

}
