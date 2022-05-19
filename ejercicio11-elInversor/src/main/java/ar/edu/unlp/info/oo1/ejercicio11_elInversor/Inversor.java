package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double valorActual() {
		return this.inversiones.stream()
				.mapToDouble(i -> i.valorActual())
				.sum();
	}
	
	public void addInversion(Inversiones inversion) {
		this.inversiones.add(inversion);
	}
	
}
