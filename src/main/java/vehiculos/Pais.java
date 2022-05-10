package vehiculos;
import java.util.HashMap;
import java.util.Map;

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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public static Pais paisMasVendedor() {
		// Diccionario
		Map<Pais,Integer> diccMasVendidos = new HashMap<Pais,Integer>();
		
		for(Vehiculos vehiculo:Vehiculo.vehiculos) {
			Pais pais = vehiculo.getFabricante().getPais();
			if(diccMasVendidos.containsKey(pais)) {
				diccMasVendidos.put(pais, masVendido.get(pais)+1);
			}else {
				diccMasVendidos.put(pais, 1);
			}
			
		}
		
		int maximo = 0;
		Pais paisMasVendedor = null;
		
		for(Pais pais:diccMasVendidos.keySet()) {			//keySet() -> Retorna todas las claves de un diccionario
			if(diccMasVendidos.get(pais) > maximo) {
				maximo = diccMasVendidos.get(pais);
				paisMasVendedor = pais;
			}
		}
		
		return paisMasVendedor;
		
	}
	
	
}
