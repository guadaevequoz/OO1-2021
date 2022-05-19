package ar.edu.unlp.info.oo1.ejercicio5_genealogiaSalvaje;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaNacimiento = new Date();
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null) {
			return this.getMadre().getMadre();
		}
		else return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null) {
			return this.getPadre().getMadre();
		}
		else return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null) {
			return this.getMadre().getPadre();
		}
		else return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null) {
			return this.getPadre().getPadre();
		}
		else return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero ancestro) {
        
        return tieneComoAncestroA(ancestro, this);
    }
    
    private static boolean tieneComoAncestroA(Mamifero ancestro, Mamifero actual) {

        if (actual != null) {
            if (actual.getPadre() == ancestro || actual.getMadre() == ancestro) return true;
            else {
                if (tieneComoAncestroA(ancestro,actual.getMadre()) || tieneComoAncestroA(ancestro,actual.getPadre())) return true;
            }
        }
        
        return false;
    }
	
	
}
