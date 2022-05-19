package ar.edu.unlp.info.oo1.balanza;

public class Balanza extends Object {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal = this.precioTotal + producto.getPrecio();
	    this.pesoTotal = this.pesoTotal + producto.getPeso();
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
		Ticket ticket = new Ticket (this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
		return ticket;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}

	/*public Balanza() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}*/
	
	
}
