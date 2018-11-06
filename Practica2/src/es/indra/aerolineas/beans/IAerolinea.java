/**
 * 
 */
package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author aula10
 *
 */
public interface IAerolinea {
	void consultarVuelos(String origen);
	
	void consultarVuelos(String origen, String destino);
	
	void anularVuelos(String... vuelos);
	
	void setVuelos(Vuelo[] vuelos);

	void setNombre(String nombre);

	String getNombre();

	Vuelo[] getVuelos();	

}
