package ar.edu.unlp.info.oo1.ejercicio6_redDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private Boolean on;
	private List<Farola> neighbours;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/

	public Farola () {
		this.on = false;
		this.neighbours = new ArrayList<Farola>();
	}

	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir 
	* el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá 
	* en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.neighbours.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.neighbours;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.on) {
			this.on = true;
			
			neighbours.forEach(vecina -> vecina.turnOn());
			/*for(Farola vecina: neighbours) {
				if(!vecina.isOn()) {
					vecina.turnOn();
				}
			}*/
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.on) {
			this.on = false;
			
			neighbours.forEach(vecina -> vecina.turnOff());
			/*for(Farola vecina: neighbours) {
				if(vecina.isOn()) {
					vecina.turnOff();
				}
			}*/
		}
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.on;
	}

}
