package vehiculos;


public class Camioneta extends Vehiculo{
	private boolean volco;
	public static int cantidadCamionetas;
	
//	public Camioneta (String placa,String nombre,int precio,int peso,Fabricante fabricante,boolean volco) { // Se deben llamar todos los parámetros que son ingresados como parámetros
	
	public Vehiculo (String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);	// Se toma del constructor padre los atributos que ya existian en el.
		this.volco = volco;
		Camioneta.cantidadCamionetas += 1;
	}
	
	// -------------------------------------------------------- GET-SET --------------------------------------------------------
	
	//	Metodos get-set (volco)
	public int isVolco() {
		return this.volco;
	}
	public setVolco(int volco) {
		this.volco = volco;
	}
	
	
}
