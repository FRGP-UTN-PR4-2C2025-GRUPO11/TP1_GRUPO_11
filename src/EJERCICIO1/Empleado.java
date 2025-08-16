package EJERCICIO1;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	static int contador=1000;

	// Constructors:
	public Empleado() {
		super();
		contador++;
		this.legajo = contador;
	}

	public Empleado(String dni, String nombre, String apellido, java.time.LocalDate
			fechaNacimiento, String genero, String direccion, String telefono, String email,
			 String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		contador++;
		this.legajo = contador;
		this.puesto = puesto;
	}
	
	// Gettters and setters
	public int getLegajo() {
		return legajo;
	}

	///public void setLegajo(int legajo) {
	///	this.legajo = legajo;
	///}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	// to string
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "]" + super.toString();
	}

	//metodo estatico
	
	public static int devuelveProximoLegajo() {
		return contador+1;
	}
}
