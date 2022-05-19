package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest2 {
	
	protected InversionEnAcciones acciones;
    protected Inversor inversor;
    protected PlazoFijo plazo;
    /* Los test de PlazoFijo sólo van a funcionar el 05/10/2021,
     * porque valorActual() hace las operaciones con LocalDate.now().
     * Habría que cambiar las fechas correspondientes. */

    private void initialize() {
        
        acciones = new InversionEnAcciones("Facebook",1,100);
        plazo = new PlazoFijo(LocalDate.of(2021,9,30),100,20); // Hace 5 días de hoy.
        inversor = new Inversor("Joaquín");
        
    }
    
    @BeforeEach
    public void setUp() {
        this.initialize();
    }
    
    @Test
    public void testInicial() {
        assertEquals(100,acciones.valorActual());
        assertEquals(200,plazo.valorActual());
        assertEquals(0,inversor.valorActual());
    }
    
    @Test
    void testAgregar() {
        inversor.addInversion(acciones);
        inversor.addInversion(plazo);
        assertEquals(300,inversor.valorActual());
    }
	
}
