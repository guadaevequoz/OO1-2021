package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test15 {
	DateLapse lapso1;
	DateLapse lapso2;
	DateLapse lapso3;
	DateLapse lapso4;
	
	OOBnB bnb;
	Usuario usuario1;
	Usuario usuario2;
	Propiedad propiedad1;
	Propiedad propiedad2;
	Reserva reserva1;
	Reserva reserva2;
	Reserva reserva3;
	
	private void initialize() {
		lapso1 = new DateLapse(LocalDate.of(2021, 12, 1),LocalDate.of(2021, 12, 10)); // Del 1 al 10 de diciembre - 9 días
		lapso2 = new DateLapse(LocalDate.of(2021, 12, 9),LocalDate.of(2021, 12, 15)); // Del 9 al 15 de diciembre - 6 días
		lapso3 = new DateLapse(LocalDate.of(2021, 12, 31),LocalDate.of(2022, 1, 7)); // Del 31 de diciembre al 7 de enero
		lapso4= new DateLapse(LocalDate.of(2022, 1, 25),LocalDate.of(2022, 2, 5)); // Del 25 de enero al 5 de febrero
		
		bnb = new OOBnB();
		usuario1 = new Usuario("Joaquín","Calle 46",43254904);
		usuario2 = new Usuario("Cali","Calle 46",0);
		propiedad1 = new Flexible("Casa","Azul",100,usuario1,"Calle 18");
		propiedad2 = new Estricta("Casa","Con garage",200,usuario2,"Calle 55");
		reserva1 = new Reserva(lapso1,propiedad1);
		reserva2 = new Reserva(lapso2,propiedad1);
		reserva3 = new Reserva(lapso3,propiedad1);
	}
	
	@BeforeEach
	public void setUp() {
		this.initialize();
		bnb.registrarUsuario(usuario1);
		bnb.registrarUsuario(usuario2);
	}
	
	@Test
	public void testUsuarios() {
		assertTrue(bnb.getUsuarios().contains(usuario1));
		assertTrue(bnb.getUsuarios().contains(usuario2));
	}
	
	@Test
	public void testPropiedad() {
		bnb.registrarPropiedad(propiedad1);
		usuario1.registrarPropiedad(propiedad1);
		assertTrue(bnb.getPropiedades().contains(propiedad1));
		assertTrue(usuario1.getPropiedades().contains(propiedad1));
	}
	
	@Test
	public void testReserva() {
		bnb.hacerReserva(lapso1,propiedad1,usuario2);
		bnb.hacerReserva(lapso2,propiedad1,usuario2);
		assertTrue(propiedad1.getReservas().contains(reserva1));
		assertFalse(propiedad1.getReservas().contains(reserva2));
		assertEquals(900,reserva1.calcularPrecio());
	}
}
