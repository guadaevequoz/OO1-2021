package ar.edu.unlp.info.oo1.ejercicio17_facturacionLlamadas;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<NumerosTelefono> numeros = new ArrayList<NumerosTelefono>();
	
	public Cliente agregarUsuario(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}
	
	public void agregarTelefono(String numero) {
		this.numeros.add(new NumerosTelefono(numero));
		this.numeros.get(0);
		this.numeros.c
	}
}
