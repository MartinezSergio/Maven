/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.Arrays;
import java.util.List;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona{
	
	
	private List<Vuelo> vuelos;

	public Pasajero() {super();}
	
	/*public Pasajero(int id, Vuelo[] vuelos) {
		super();	
		this.vuelos = vuelos;
	}*/
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	

	public String getApellidos() {
		return apellidos.toUpperCase();
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Vuelo> getVuelos() {
		return vuelos;
	}
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String solicitarInfomacion() {
		return "";
	}

	@Override
	public String toString() {
		return  dni + ";" + nombre + ";" + apellidos;
	}
	
	
	

	
	
	

}
