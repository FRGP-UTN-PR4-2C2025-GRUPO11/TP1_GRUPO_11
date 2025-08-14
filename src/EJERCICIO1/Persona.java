package EJERCICIO1;

import java.time.LocalDate;

public class Persona {
	String dni;
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	String genero;
	String direccion;
	String telefono;
	String email;
	
	private String getDni() {
		return dni;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	private void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	private String getGenero() {
		return genero;
	}
	private void setGenero(String genero) {
		this.genero = genero;
	}
	private String getDireccion() {
		return direccion;
	}
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	private String getTelefono() {
		return telefono;
	}
	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Persona [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getGenero()=" + getGenero()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + "]";
	}

}
