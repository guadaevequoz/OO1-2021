package ar.edu.unlp.info.oo1.ejercicio7_methodLookupEmpleados;

public class A {
	public void actionOne() {
		System.out.println("a");
	}
	
	public void actionTwo() {
		this.actionOne();
	}
}
