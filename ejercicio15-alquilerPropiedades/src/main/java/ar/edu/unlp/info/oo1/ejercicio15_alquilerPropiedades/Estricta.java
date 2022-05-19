package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;

public class Estricta extends Propiedad{

	public Estricta(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
		super(nombre, descripcion, precioPorNoche, dueño, direccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularReembolso(Reserva reserva, LocalDate fecha) {
		return 0;
	}

}
