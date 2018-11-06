/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author aula10
 *
 */
public abstract class Persona {
	
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected int id;
	
	public Persona() {
		super();
		
	}
	
	public abstract String solicitarInfomacion();
		
	
	/**
	 * @return the nombre en mayúsculas que lo necesitan los pasajeros
	 */

	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
