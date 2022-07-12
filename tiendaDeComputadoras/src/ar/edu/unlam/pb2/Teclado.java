package ar.edu.unlam.pb2;

public class Teclado extends DispositivoEntrada{
	
	private final Integer idTeclado;
	private  static Integer contadorTeclados;

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		
		this.idTeclado = ++Teclado.contadorTeclados;
	}

	public static Integer getContadorTeclados() {
		return contadorTeclados;
	}

	

	public Integer getIdTeclado() {
		return idTeclado;
	}

	
	
	
	
}
