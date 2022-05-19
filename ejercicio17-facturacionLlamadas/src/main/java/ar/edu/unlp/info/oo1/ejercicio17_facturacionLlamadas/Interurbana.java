package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Interurbana extends Llamada{
	private double distancia;
	
	public Interurbana(LocalDate fecha, LocalTime hora, int duracion, NumerosTelefono numOrigen,
			NumerosTelefono numDestino, double distancia) {
		super(fecha, hora, duracion, numOrigen, numDestino);
		this.distancia = distancia;
	}

	@Override
	public double getPrecio() {
		if(this.distancia < 100) {
			return 5 + 2*super.getDuracion();
		}else {
			if(this.distancia > 100 && this.distancia < 500) {
				return 5 + 2.5*super.getDuracion();
			}else {
				return 5 + 3*super.getDuracion();
			}
		}
	}

}
