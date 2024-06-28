package org.servicio.empleado;

public class ServicioEmpleado {
	public double salarioBono(double salario, double bono) {
		return salario + bono;
	}

	public double salarioPrestamo(double salario, double prestamo) {
		return salario - prestamo;
	}

	public double salarioAguinaldo(double salario, double aguinaldo) {
		return salario * 2 + aguinaldo;
	}
}
