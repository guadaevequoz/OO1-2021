package ar.edu.unlp.info.oo1.ejecicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CuentaTest {
 
  private CajaDeAhorro caja;
  
  private CuentaCorriente cuenta;
  
  @BeforeEach
  void setUp() throws Exception {
	   caja = new CajaDeAhorro(100);
	   cuenta = new CuentaCorriente(200,25);
  }

  @Test
  void testExtraer() {
	caja.extraer(50);
	cuenta.extraer(225);
    assertEquals(49, caja.getSaldo());
    assertEquals(-25, cuenta.getSaldo());
  }

  @Test
  void testDepositar() {
	  caja.depositar(100);
	  assertEquals(198, caja.getSaldo());
	  
	  cuenta.depositar(100);
	  assertEquals(300, cuenta.getSaldo());
  }
  
  @Test
  void testTransferir() {
    caja.transferirACuenta(50, cuenta);
    assertEquals(49, caja.getSaldo());
    assertEquals(251, cuenta.getSaldo());
  }
  
  @Test
  void testJoacko() {
    caja.extraer(50);
    assertEquals(49, caja.getSaldo());
    
    cuenta.extraer(225);
    assertEquals(-25, cuenta.getSaldo());
    
    caja.depositar(100);
    caja.transferirACuenta(50, cuenta);
    assertEquals(96, caja.getSaldo());
    assertEquals(25, cuenta.getSaldo());
  }
  
}
