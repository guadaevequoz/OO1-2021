package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest {
	
	Inversor inversor;
	PlazoFijo plazoF;
	InversionEnAcciones acciones1;
	InversionEnAcciones acciones2;
	
	@BeforeEach
	void setUp() throws Exception {
		inversor = new Inversor("Pepito");
		plazoF =  new PlazoFijo(LocalDate.of(2021, 10, 4),23000,10);
		acciones1 = new InversionEnAcciones("Bitcoin",5,100);
		acciones2 = new InversionEnAcciones("Nose",10,5000);
	}
	
	@Test
	void testAdd() {
		inversor.addInversion(acciones1);
		inversor.addInversion(acciones2);
		inversor.addInversion(plazoF);
		assertEquals(75800,inversor.valorActual());
	}
	
}
