package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;

public class Item {
	private String detalle;
	private Integer cantidad;
	private double costoUnitario;
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public double costo() {
		return this.getCostoUnitario() * this.getCantidad();
	}
	public Item detalle(String detalle) {
		this.setDetalle(detalle);
		return this;
	}
	public Item costoUnitario(int i) {
		this.setCostoUnitario(i);
		return this;
	}
	public Item cantidad(int cantidad) {
		this.setCantidad(cantidad);
		return this;
	}
	
}
