package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadasTest {
	private Sistema servicio;
	private Individuo clienteI;
	private PersonaJuridica clienteJ;
	private Local llamadaL;
	private Interurbana llamadaU;
	private Internacional llamadaN;
	private Local llamadaJ;
	
	private void initialize() {
		servicio = new Servicio();
		servicio.agregarTelefono("20212682");
		servicio.agregarTelefono("2216002378");
		clienteI = new Individuo("Joaquín","Calle 45","43254904");
	    servicio.agregarUsuario(clienteI);
		clienteJ = new PersonaJuridica("NASA","Avenida 666","6002378","Sociedad anónima");
	    servicio.agregarUsuario(clienteJ);
		llamadaL = servicio.registrarLlamadaLocal(clienteI.getNumero(),clienteJ.getNumero(),100);
		llamadaJ = servicio.registrarLlamadaLocal(clienteJ.getNumero(),clienteI.getNumero(),1000);
		llamadaU = servicio.registrarLlamadaInterurbana(clienteI.getNumero(),clienteJ.getNumero(),100,250);
		llamadaN = servicio.registrarLlamadaInternacional(clienteI.getNumero(),clienteJ.getNumero(),100,"Argentina","Bolivia"); // Hora: 16.14
	}
	
	@BeforeEach
	public void setUp() {
		this.initialize();
	}
	
	@Test
	public void testUsuarios() {
		assertEquals(clienteI.numero(),"20212682");
		assertEquals(clienteJ.numero(),"2216002378");
	}
	
	@Test
	public void testLlamada() {
		assertEquals(llamadaL.getPrecio(),100);
		assertEquals(llamadaU.getPrecio(),750);
		assertEquals(llamadaN.getPrecio(),400);
	}
	
	@Test
	public void testFactura() {
		Factura factura1 = servicio.facturarLlamadas(clienteI,LocalDate.of(2021, 10, 19),LocalDate.of(2021, 10, 21));
		Factura factura2= servicio.facturarLlamadas(clienteJ,LocalDate.of(2021, 10, 19),LocalDate.of(2021, 10, 21));
		assertEquals(factura1.getMonto(),1125);
		assertEquals(factura2.getMonto(),1000);
	}
}
