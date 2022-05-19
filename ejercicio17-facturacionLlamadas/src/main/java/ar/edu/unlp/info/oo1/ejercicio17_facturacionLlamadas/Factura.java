package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.time.LocalDate;

public class Factura {
	private LocalDate fechaFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double monto;
	private Cliente cliente;
	
	public Factura(LocalDate fechaFacturacion, LocalDate fechaInicio, LocalDate fechaFin, double monto,
			Cliente cliente) {
		this.fechaFacturacion = fechaFacturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.setMonto(monto);
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Factura [fechaFacturacion=" + fechaFacturacion + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", monto=" + monto + ", cliente=" + cliente + "]";
	}
	
	
}
