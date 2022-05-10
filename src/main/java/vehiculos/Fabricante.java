package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//	Metodos get-set (pais)
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMasVendedor() {
		// Diccionario
		Map<Fabricante,Integer> diccMasVendidosFab = new HashMap<Fabricante,Integer>();
		
		for(Vehiculo vehiculo:Vehiculo.vehiculos) {
			Fabricante fabricante = vehiculo.getFabricante();
			if(diccMasVendidosFab.containsKey(fabricante)) {
				diccMasVendidosFab.put(fabricante, diccMasVendidosFab.get(fabricante)+1);
			}else {
				diccMasVendidosFab.put(fabricante, 1);
			}
			
		}
		
		int maximoF = 0;
		Fabricante fabricaMasVendedora = null;
		
		for(Fabricante i:diccMasVendidosFab.keySet()) {			//keySet() -> Retorna todas las claves de un diccionario
			if(diccMasVendidosFab.get(i) > maximoF) {
				maximoF = diccMasVendidosFab.get(i);
				fabricaMasVendedora = i;
			}
		}
		
		return fabricaMasVendedora;
		
	}
}
