package ar.edu.unlp.info.oo1.ejercicio15_alquilerPropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collector;

public class Usuario {
	private String nombre;
	private Integer DNI;
	private String direccion;
	private ArrayList<Propiedad> propiedades;
	private ArrayList<Reserva> reservas;
	
	public Usuario(String nombre, String direccion,Integer DNI){
		this.nombre = nombre;
		this.DNI =  DNI;
		this.direccion = direccion;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}
	
	public ArrayList<Reserva> getReservas(){
		return this.reservas;
	}
	
	public ArrayList<Propiedad> getPropiedades(){
		return this.propiedades;
	}
	
	public void hacerReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}

	public void registrarPropiedad(Propiedad propiedad1) {
		this.propiedades.add(propiedad1);
		
	}
	
}
