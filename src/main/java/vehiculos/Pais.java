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
	
//	Lógica.
	
//Crear un diccionario "masvendidos" agregar al diccionario el pais por fabricante
//Pais pais = vehiculo.getFabricante().getPais();. Comparar si el valor ya está en el diccionario "diccionario.containsKey(pais)"
//si si le suma uno al key masVendido.put(pais, masVendido.get(pais)+1); , si no lo agrega con put
//
//Luego el maximo en ese diccionario
	
}
