package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Circulo implements Figura {
	private double radio;
	private double diametro;
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = this.diametro / 2;
	}
	
	public double getDiametro() {
		return this.diametro;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = this.radio * 2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getPerimetro() {
		return this.diametro * Math.PI;
	}
	
	public double getArea() {
		return (this.radio * this.radio) * Math.PI;
	}
}
