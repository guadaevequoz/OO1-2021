package ar.edu.unlp.info.oo1.ejercicio7_methodLookupEmpleados;

public class Gerente extends EmpleadoJerarquico{
	public Gerente(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
	public double montoBasico() {
		return 57000;
	}
}
