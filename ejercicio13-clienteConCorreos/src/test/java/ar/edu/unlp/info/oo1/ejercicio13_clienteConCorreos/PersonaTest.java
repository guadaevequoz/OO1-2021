package ar.edu.unlp.info.oo1.ejercicio13_clienteConCorreos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	protected ClienteDeCorreo cliente;
    protected Email primerCorreo;
    protected Email segundoCorreo;
    protected ArrayList<Archivo> adjuntos;
    protected Carpeta carpeta;
    protected Carpeta carpeta2;
    
    private void initialize() {
        cliente = new ClienteDeCorreo();
        
        primerCorreo = new Email("Hola","a"); // Tamaño = 5
        segundoCorreo = new Email("Cómo están",""); // Tamaño = 10
        
        adjuntos = new ArrayList<Archivo>();
        
        carpeta = new Carpeta("Carpeta1");
        carpeta.agregarMail(primerCorreo);
        carpeta2 = new Carpeta("Carpeta2");
        carpeta2.agregarMail(segundoCorreo);
    }
    
    @BeforeEach
    public void setUp() {
        this.initialize();
    }
    
    @Test
    public void testCliente() {
        cliente.recibir(primerCorreo);
        assertEquals(cliente.espacioOcupado(),5);
        cliente.recibir(segundoCorreo);
        assertEquals(cliente.espacioOcupado(),15);
    }
    
    @Test
    public void testCarpetas() {
        cliente.recibir(primerCorreo);
        assertEquals(cliente.espacioOcupado(),5);
        cliente.agregarCarpeta(carpeta);
        cliente.mover(primerCorreo,carpeta2,carpeta);
    }
    
    @Test
    public void testEmail() {
        adjuntos.add(new Archivo("Hola")); // Tamaño = 4
        adjuntos.add(new Archivo("Buenas")); // Tamaño = 6
        
        Email correo = new Email("Hola","a",adjuntos); // Tamaño = 15
        assertEquals(correo.tamanio(), 15);
    }
    
}
