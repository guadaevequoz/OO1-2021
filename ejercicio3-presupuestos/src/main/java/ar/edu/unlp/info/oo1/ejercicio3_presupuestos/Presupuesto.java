package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items = new ArrayList<Item>();

	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		double cont = 0;
		for (Item i:items) {
            cont = cont + i.costo();
        }
		return cont;
	}
	public Presupuesto cliente(String cliente) {
		this.setCliente(cliente);
		return this;
	}
}
