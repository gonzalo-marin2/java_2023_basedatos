package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Empleado;
import service.EmpleadosService;

class TestEmpleadosService {
	EmpleadosService service;
	@BeforeEach
	void setUp() throws Exception {
		service=new EmpleadosService();
	}

	/*@Test
	void testAltaEmpleado() {
		assertTrue(service.altaEmpleado(new Empleado("e3","e3@mail.com","dep3",2200)));
	}*/
	
	@Test
	void testEliminarEmpleado() {
		assertTrue(service.eliminarEmpleado("e3@mail.com"));
	}
	
	/*@Test
	void testModificarSalario() {
		assertTrue(service.modificarSalario());
	}*/

}
