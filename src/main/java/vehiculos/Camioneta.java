package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{
	private boolean volco;
	public static int cantidadCamionetas;

	
	public Camioneta (String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,int ejes) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);	// Se toma del constructor padre los atributos que ya existian en el.
		this.volco = volco;
		Camioneta.cantidadCamionetas += 1;
	}
	
	// -------------------------------------------------------- GET-SET --------------------------------------------------------
	
	//	Metodos get-set (volco)
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	
}
