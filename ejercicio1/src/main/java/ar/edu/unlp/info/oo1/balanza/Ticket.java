package ar.edu.unlp.info.oo1.balanza;

import java.time.LocalDate;

public class Ticket extends Object  {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = LocalDate.now();
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		super();
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
}
