package ar.edu.unlam.pb2;

public class Raton extends DispositivoEntrada{
	
	private final Integer idRaton;
	private static Integer contdorRatones;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		
		this.idRaton = ++Raton.contdorRatones;
		
	}

	public Integer getIdRaton() {
		return idRaton;
	}

	

	public Integer getContdorRatones() {
		return contdorRatones;
	}

	
	
	

}
