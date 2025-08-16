package EJERCICIO1;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;

	// Construstors
	public Persona() {
		this.nombre = "Sin nombre";
		this.fechaNacimiento = LocalDate.parse("2025-01-01");
	};

	public Persona(String dni, String nombre, String apellido,
			LocalDate fechaNacimiento, String genero, String direccion,
			String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	private String getDni() {
		return dni;
	}

	private String getNombre() {
		return nombre;
	}

	private String getApellido() {
		return apellido;
	}

	private LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	private String getGenero() {
		return genero;
	}

	private String getDireccion() {
		return direccion;
	}

	private String getTelefono() {
		return telefono;
	}

	private String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + getDni() + ", NOMBRE=" + getNombre() + ", APELLIDO=" + getApellido() + ", FECHA DE NACIMIENTO=" + getFechaNacimiento() + ", GENERO=" + getGenero()
		    + ", DIRECCION=" + getDireccion() + ", TELEFONO=" + getTelefono() + ", EMAIL=" + getEmail() + "]";
	}

}
