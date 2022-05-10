package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo{
	private int ejes;
	public static int cantidadCamiones;
	
	public Camion (String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		Camion.cantidadCamiones += 1;
	}
	
	
	// -------------------------------------------------------- GET-SET --------------------------------------------------------
	
	//	Metodos get-set (ejes)
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
