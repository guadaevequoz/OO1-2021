package ar.edu.unlp.info.oo1.ejercicio11_elInversor;

import java.time.LocalDate;

public class PlazoFijo implements Inversiones{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	@Override
	public double valorActual() {
		int dias = this.getFechaDeConstitucion().until(LocalDate.now()).getDays();
		return  this.getMontoDepositado() + (this.getPorcentaje() * dias);
	}
	
	private double getPorcentaje() {
		return (this.getMontoDepositado() * this.porcentajeDeInteresDiario) / 100;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	
}
