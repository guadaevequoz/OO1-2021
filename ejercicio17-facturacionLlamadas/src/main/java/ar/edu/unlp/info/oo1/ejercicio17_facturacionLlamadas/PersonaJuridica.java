package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;

public class PersonaJuridica extends Cliente{
	private int CUIT;
	private String tipoPersona;
	
	public PersonaJuridica(String nombre, String direccion, 
			NumerosTelefono numTel, int CUIT, String tipoPersona) {
		super(nombre, direccion, numTel);
		this.CUIT = CUIT;
		this.tipoPersona = tipoPersona;
	}
	
	
	public Factura facturarLlamadas(LocalDate fechaInicio, LocalDate fechaFin) {
		double monto = super.facturarLlamadas(fechaInicio, fechaFin).getMonto();
		monto = monto - (monto*0.1);
		return new Factura(LocalDate.now(),fechaInicio,fechaFin,monto,this);
	}
}
