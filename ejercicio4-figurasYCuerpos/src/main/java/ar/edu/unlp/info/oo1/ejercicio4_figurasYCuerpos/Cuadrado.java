package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Cuadrado implements Figura {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}
	
}
