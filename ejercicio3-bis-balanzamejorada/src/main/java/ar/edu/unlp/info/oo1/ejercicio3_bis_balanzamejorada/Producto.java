package ar.edu.unlp.info.oo1.ejercicio3_bis_balanzamejorada;

public class Producto extends Object {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(int kilo) {
		this.precioPorKilo = kilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public Double getPeso() {
		return this.peso;
	}

	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}

	public double getPrecio() {
		return (this.getPeso() * this.getPrecioPorKilo());
	}
	
	
}
