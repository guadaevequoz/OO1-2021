package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

public class NumerosTelefono {
	private String numero;
	private Cliente propietario;
	
	public NumerosTelefono(String numero) {
		this.numero = numero;
		this.propietario = null;
	}
	
	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}
}
