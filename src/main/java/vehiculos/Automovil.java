package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
	
	private int puestos;
	public static int cantidadAutomoviles;
	
	public Automovil (String placa,String nombre,int precio,int peso,Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);	
		this.puestos = puestos;
		Automovil.cantidadAutomoviles += 1;
	}
	
	
	
	
	// -------------------------------------------------------- GET-SET --------------------------------------------------------
	
	//	Metodos get-set (puestos)
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

}
