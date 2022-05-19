package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;

public class Moderada extends Propiedad{

	public Moderada(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
		super(nombre, descripcion, precioPorNoche, dueño, direccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularReembolso(Reserva reserva, LocalDate fecha) {
		if(super.getReservas().contains(reserva)) {
			if(fecha.isBefore((reserva.getPeriodo().getFrom().minusDays(7))))
				return reserva.calcularPrecio();
			else
				if(fecha.isBefore((reserva.getPeriodo().getFrom().minusDays(2))))
					return reserva.calcularPrecio();
				else
					return 0;
		}else {
			return 0;
		}
	}

}
