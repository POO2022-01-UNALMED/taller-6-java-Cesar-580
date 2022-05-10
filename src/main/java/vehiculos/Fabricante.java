package vehiculos;

import java.util.HashMap;
import java.util.Map;

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
	
	//	Lógica.
	
	//Crear un diccionario "masvendidos" agregar al diccionario el pais por fabricante
	//Fabricante  fabricante = vehiculo.getFabricante();. Comparar si el valor ya está en el diccionario "diccionario.containsKey(fabricante)"
	//si si le suma uno al key masVendido.put(pais, masVendido.get(pais)+1); , si no lo agrega con put
	//
	//Luego el maximo en ese diccionario
	
	public static Fabricante fabricaMasVendedor() {
		// Diccionario
		Map<Fabricante,Integer> diccMasVendidosFab = new HashMap<Fabricante,Integer>();
		
		for(Vehiculos vehiculo:Vehiculo.vehiculos) {
			Fabricante fabricante = vehiculo.getFabricante();
			if(diccMasVendidosFab.containsKey(fabricante)) {
				diccMasVendidosFab.put(fabricante, masVendido.get(fabricante)+1);
			}else {
				diccMasVendidosFab.put(fabricante, 1);
			}
			
		}
		
		int maximoF = 0;
		Fabricante fabricaMasVendedora = null;
		
		for(Fabricante fabrica:diccMasVendidosFab.keySet()) {			//keySet() -> Retorna todas las claves de un diccionario
			if(diccMasVendidosFab.get(pais) > maximoF) {
				maximoF = diccMasVendidosFab.get(fabrica);
				fabricaMasVendedora = fabrica;
			}
		}
		
		return fabricaMasVendedora;
		
	}
}
