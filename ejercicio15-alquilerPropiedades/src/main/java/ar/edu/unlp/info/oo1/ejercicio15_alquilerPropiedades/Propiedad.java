package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Propiedad {
	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private Usuario dueño;
	private List<Reserva> fechasOcupadas; /*son las reservas*/
	
	public Propiedad(String nombre, String descripcion, double precioPorNoche, Usuario dueño, String direccion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dueño = dueño;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.fechasOcupadas = new ArrayList<Reserva>();
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		List<Boolean> f = fechasOcupadas.stream()
			.map(r -> r.getPeriodo().equals(periodo))
			.collect(Collectors.toList());
		
		if (f.isEmpty())
			return true;
		else
			return false;
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	
	public void agregarReserva(Reserva reserva) {
		this.fechasOcupadas.add(reserva);
	}
	
	public void liberarFecha(Reserva reserva) {
		this.fechasOcupadas.remove(reserva);
	}
	
	public ArrayList<Reserva> getReservas(){
		return (ArrayList<Reserva>) this.fechasOcupadas;
	}
	
	public abstract double calcularReembolso(Reserva reserva, LocalDate fecha);
	
}
