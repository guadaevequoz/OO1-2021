package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;

public class Flexible extends Propiedad{

	public Flexible(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
		super(nombre, descripcion, precioPorNoche, dueño, direccion);
	}

	@Override
	public double calcularReembolso(Reserva reserva, LocalDate fecha) {
		if(super.getReservas().contains(reserva)) {
			if(reserva.getPeriodo().getFrom().isAfter(fecha))
				return reserva.calcularPrecio();
			else
				return 0;
		}else {
			return 0;
		}
	}

}
