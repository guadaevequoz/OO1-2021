package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Llamada {
	protected LocalDate fecha;
	protected LocalTime hora;
	private int duracion;
	private NumerosTelefono numOrigen;
	private NumerosTelefono numDestino;
	
	public Llamada(LocalDate fecha, LocalTime hora, int duracion, NumerosTelefono numOrigen,
			NumerosTelefono numDestino) {
		this.fecha = fecha;
		this.hora = hora;
		this.setDuracion(duracion);
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
	}
	
	public abstract double getPrecio();

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public boolean entreFechas(LocalDate fecha1,LocalDate fecha2) {
		if (this.fecha.isAfter(fecha1) && (this.fecha.isBefore(fecha2)))
			return true;
		else
			return false;
	}
}
