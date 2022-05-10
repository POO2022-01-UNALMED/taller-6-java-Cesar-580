package vehiculos;


public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Vehiculo (String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos += 1;
		vehiculos.add(this);
	}
	

	// ------------------------------------------------ Metodo vehiculosPorTipo ------------------------------------------------
	
	public static String vehiculosPorTipo () {
		return "Automoviles: " + Automovil.cantidadAutomoviles + "Camionetas: " + Camioneta.cantidadCamionetas  + "Camiones: " + Camion.cantidadCamiones; 
	}
	

	
	// -------------------------------------------------------- GET-SET --------------------------------------------------------
	
	//	Metodos get-set (placa)
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//	Metodos get-set (puertas)
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	//	Metodos get-set (velocidadMaxima)
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//	Metodos get-set (nombre)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//	Metodos get-set (precio)
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}	
	
	//	Metodos get-set (peso)
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//	Metodos get-set (traccion)
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	//	Metodos get-set (fabricante)
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricanten(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
