package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DateLapse2.DateLapse2;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DateLapseTest {
	
	Date lapso;
	Date lapso2;
	LocalDate from = LocalDate.of(2000, Month.AUGUST, 30);
	LocalDate to = LocalDate.of(2001, Month.JUNE, 21);
	LocalDate other = LocalDate.of(2001, Month.MAY, 21);
	LocalDate other2 = LocalDate.of(2003, Month.JULY, 21);
	
	@BeforeEach
	void setUp() throws Exception {
		lapso = new DateLapse(from,to);
		lapso2 = new DateLapse2(from,10);
	}
	
    @Test
    public void testImplementacion() {
        assertEquals(30, lapso.getFrom().getDayOfMonth());
        assertEquals(21, ((DateLapse) lapso).getTo().getDayOfMonth());
        assertEquals(30, lapso.getFrom().getDayOfMonth());
    }
    
    @Test
    public void testSizeInDays() {
        assertEquals(295, lapso.sizeInDays());
        assertEquals(10, lapso2.sizeInDays());
    }
    
    @Test
    public void testIncludeDate() {
        assertTrue(lapso.includesDate(other));
        assertFalse(lapso.includesDate(other2));
        assertFalse(lapso2.includesDate(other));
    }
}
