package EJERCICIO1;

public class Empleado extends Persona {
	private int legajo;
	private String puesto;

	// Constructors:
	public Empleado() {
		super();
	}

	public Empleado(String dni, String nombre, String apellido, java.time.LocalDate
			fechaNacimiento, String genero, String direccion, String telefono, String email,
			int legajo, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.legajo = legajo;
		this.puesto = puesto;
	}

	// Gettters and setters
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

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
}
