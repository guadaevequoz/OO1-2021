package ar.edu.unlp.info.oo1.ejercicio8_distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas = new ArrayList<Factura>();
	private List<Consumo> consumos = new ArrayList<Consumo>();
	
	public Usuario(String domicilio, String nombre) {
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDomicilio() {
		return this.domicilio;
	}
	public void agregarFactura(Factura factura){
		this.facturas.add(factura);
	}
	
	public List<Factura> facturas(){
		return facturas;
	}
	
	/**
	 * Obtiene el consumo de energía activa desde el consumo con fecha más reciente.
	 * Si no hay ningún consumo, retorna 0
	 * @return
	 */
	public double ultimoConsumoActiva() {
		return this.ultimoConsumoAsOptional()
				.map((Consumo c) -> c.getConsumoDeEnergiaActiva())
				.orElse(0d);
	}
	
	/**
	 * Retorna un Optional, dependiendo si hay o no consumos.
	 * @return
	 */
	private Optional<Consumo> ultimoConsumoAsOptional() {
		//retorna un Optional ya que puede no tener consumos
		return this.consumos
			.stream()
			.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()));
	}
	
	/**
	 * Retorna el último consumo o null en caso que no exista
	 * @return
	 */
	public Consumo ultimoConsumo() {
		return this.ultimoConsumoAsOptional().orElse(null);
	}
	/**
	 * Si hay consumos, retorna lo correspondiente al consumo realizado.
	 * Factura 0 si no hay consumos.
	 * @param precioKW
	 * @return
	 */
	
	public Factura facturarEnBaseA(double precioKW) {
		Consumo ultimo = this.ultimoConsumo();
		if (ultimo == null) {
			return new Factura(0, 0, this);
		}

		double descuento = 0d;
		if (ultimo.factorDePotencia() > 0.8d) {
			descuento = 10;
		}
		return new Factura(ultimo.costoEnBaseA(precioKW), descuento, this);
	}
	
	/*public Consumo ultimoConsumo() {
        Optional<Consumo> optional = this.consumos
            .stream()
            .max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()));
        return optional.get();
    }
    
    public double ultimoConsumoActiva() {
        return this.ultimoConsumo().getConsumoEnergiaActiva();
    }
    
    public double ultimoConsumoReactiva() {
        return this.ultimoConsumo().getConsumoEnergiaReactiva();
    }*/
}
