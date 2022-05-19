package ar.edu.unlp.info.oo1.ejercicio3_bis_balanzamejorada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket extends Object  {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private ArrayList<Producto> productos= new ArrayList<Producto>();
	
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
	
	public Ticket(ArrayList<Producto> productos) {
		super();
		this.fecha = LocalDate.now();
		this.productos.addAll(productos);
		for (Producto i:productos) {
            this.pesoTotal = this.getPesoTotal() + i.getPeso();
            this.precioTotal = this.getPrecioTotal() + i.getPrecio();
        }
		this.cantidadDeProductos = productos.size();
	}
	
	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
}
