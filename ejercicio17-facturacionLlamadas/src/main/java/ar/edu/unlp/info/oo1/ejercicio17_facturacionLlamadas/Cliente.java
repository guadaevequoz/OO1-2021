package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private NumerosTelefono numTel;
	private ArrayList<Llamada> llamadas;
	
	public Cliente(String nombre, String direccion, NumerosTelefono numTel) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numTel = numTel;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public void registrarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	public Factura facturarLlamadas(LocalDate fechaInicio, LocalDate fechaFin) {
		double monto = this.llamadas.stream()
				.filter(l -> l.entreFechas(fechaInicio, fechaFin))
				.mapToDouble(l -> l.getPrecio())
				.sum();
		return new Factura(LocalDate.now(),fechaInicio,fechaFin,monto,this);
	}
}
