package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

public class Individuo extends Cliente{
	private int DNI;
	
	public Individuo(String nombre, String direccion, NumerosTelefono numTel, int dni) {
		super(nombre, direccion, numTel);
		this.DNI = dni;
	}

	
	
}
