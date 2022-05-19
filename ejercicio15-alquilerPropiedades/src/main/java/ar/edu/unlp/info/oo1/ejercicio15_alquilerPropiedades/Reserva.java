package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.setPeriodo(periodo);
		this.propiedad = propiedad;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	public double calcularPrecio() {
		return this.propiedad.getPrecioPorNoche() * this.periodo.sizeInDays();
	}
}
