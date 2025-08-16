package EJERCICIO1;

import java.time.LocalDate;

public class Principal {
	public static void main (String[] args)
	{
		Empleado[] vEmpleados = new Empleado[5];
		vEmpleados[0] = new Empleado("11.111.111", "Mariano", "Belgrano", LocalDate.parse("1978-08-12"), "M", "Chubut 415", "123", "mariano@example.com", "Dev");
		vEmpleados[1] = new Empleado("22.222.222", "Carlos", "Zubilete", LocalDate.parse("1997-01-01"), "M", "San Martin 1", "234", "carlos@example.com", "Analista Funcional");
		vEmpleados[2] = new Empleado("33.333.333", "Gabriel", "Erizaga", LocalDate.parse("2005-01-01"), "M", "Belgrano 2", "345", "gabriel@example.com", "PM");
		vEmpleados[3] = new Empleado("44.444.444", "Martin", "Rodriguez", LocalDate.parse("2005-02-02"), "M", "Rivadavia 3", "456", "martin@example.com", "Scrum Master");
		vEmpleados[4] = new Empleado();
		
		for (Empleado e : vEmpleados)
		{
			System.out.println(e.toString());
		}
		System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo() );
		
	}
}
