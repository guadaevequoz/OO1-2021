package ar.edu.unlp.info.oo1.ejercicio3_bis_balanzamejorada;
import java.util.*;

public class Balanza extends Object {
	//tanto pesototal como preciototal estan al pedo porque se pueden conseguir los totales de otra manerra
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private ArrayList<Producto> productos= new ArrayList<Producto>();
	
	public void agregarProducto(Producto producto) {
		/*this.cantidadDeProductos++;*/
		this.precioTotal = this.precioTotal + producto.getPrecio();
	    this.pesoTotal = this.pesoTotal + producto.getPeso();
		productos.stream();
	    productos.add(producto);
	    this.cantidadDeProductos = productos.size();
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket (this.productos);
		return ticket;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.productos.clear();
	}

	
	public List<Producto> getProductos(){
		return this.productos;
	}
}
