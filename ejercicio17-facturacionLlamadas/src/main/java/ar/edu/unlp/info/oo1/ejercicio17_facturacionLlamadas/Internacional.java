package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Internacional extends Llamada{
	private String paisOrigen;
	private String paisDestino;
	
	public Internacional(LocalDate fecha, LocalTime hora, int duracion, NumerosTelefono numOrigen,
			NumerosTelefono numDestino, String paisO, String paisD) {
		super(fecha, hora, duracion, numOrigen, numDestino);
		this.paisDestino = paisD;
		this.paisOrigen = paisO;
	}

	@Override
	public double getPrecio() {
		super.hora.isAfter(LocalTime.parse("08,00,00"));
		return 0;
	}

}
