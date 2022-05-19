package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local extends Llamada{
	
	public Local(LocalDate fecha, LocalTime hora, int duracion, NumerosTelefono numOrigen, NumerosTelefono numDestino) {
		super(fecha, hora, duracion, numOrigen, numDestino);
	}

	@Override
	public double getPrecio() {
		return super.getDuracion();
	}

}
