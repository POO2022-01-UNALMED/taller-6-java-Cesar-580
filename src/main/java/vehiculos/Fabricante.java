package vehiculos;


public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		super();					//Toma el constructor de object
		this.nombre = nombre;
		this.pais = pais;
	}
	
	//	Metodos get-set (nombre)
	public String getNombre() {
		return this.nombre;
	}
	public setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//	Metodos get-set (pais)
	public Pais getPais() {
		return this.nombre;
	}
	public setPais(Pais pais) {
		this.pais = pais;
	}
}
