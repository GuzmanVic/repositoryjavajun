package org.prueba.unitaria;

import org.junit.jupiter.api.Test;
import org.servicio.empleado.ServicioEmpleado;

import junit.framework.TestCase;

/*1.- HEREDAR DE TESTCASE
 *2.- LOS NOMBRES DE TODOS LOS MÉTODOS DEBEN LLEVAR LA PALABRA TEST
 *3.- TODOS LOS MÉTODOS DEBEN LLEVAR LA ANOTACIÓN @Test*/
class PruebaUnitariaJunit extends TestCase {
	ServicioEmpleado servicioEmpleado;

	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();
	}

	@Test
	public void testPruebaSalarioBono() {
		test();
		assertTrue(servicioEmpleado.salarioBono(10000.0, 5000.0) == 15000);
	}
	@Test
	public void testPruebaSalarioPrestamo() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamo(10000.0, 2000.0),8000.0);
	}
	@Test
	public void testPruebaSalarioAgionaldo() {
		test();
		assertTrue(servicioEmpleado.salarioAguinaldo(10000.0, 10000.0)==30000.0);
	}
}
