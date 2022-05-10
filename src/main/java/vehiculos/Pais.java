package vehiculos;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		super();					//Toma el constructor de object
		this.nombre = nombre;
	}
	
	//	Metodos get-set (nombre)
	public String getNombre() {
		return this.nombre;
	}
	public setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
