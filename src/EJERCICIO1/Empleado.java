package EJERCICIO1;

import java.time.LocalDate;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	static int contador=999;

	// Constructors:
	public Empleado() {
		super();
		contador++;
		this.legajo = contador;
	}

	public Empleado(String dni, String nombre, String apellido, LocalDate
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	// to string
	@Override
	public String toString() {
		return super.toString() + "\nEmpleado [LEGAJO=" + legajo + ", PUESTO=" + puesto + "]\n";
	}

	//metodo estatico

	public static int devuelveProximoLegajo() {
		return contador+1;
	}

	public static void listadoEmpleados(Empleado[] vEmpleados) {
		if (vEmpleados == null || vEmpleados.length == 0) {
	        System.out.println("No hay empleados para mostrar.");
	        return;
	    }

		for (Empleado e : vEmpleados)
		{
			System.out.println(e.toString());
		}
	}

	public static void buscarEmpleadoPorLegajo(Empleado[] vEmpleados, int legajo) {
		if (vEmpleados == null || vEmpleados.length == 0) {
	        System.out.println("No hay empleados para mostrar.");
	        return;
	    }

		for (Empleado e : vEmpleados)
		{
			if(e.getLegajo() == legajo)
			{
				System.out.println(e.toString());
			}
		}
	}


}
