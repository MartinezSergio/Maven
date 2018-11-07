/**
 * 
 */
package es.indra.aerolineas.beans;

import java.io.IOException;
import java.util.Map;

import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author aula10
 *
 */
public interface IAerolinea {
	void consultarVuelos(String origen) throws IOException;
	
	void consultarVuelos(String origen, String destino);
	
	void anularVuelos(String... vuelos);
	
	void setVuelos(Vuelo[] vuelos);

	void setNombre(String nombre);

	String getNombre();

	Vuelo[] getVuelos();	

	public Map<Integer, Billete> getBilletes();		
	
	public void setBilletes(Map<Integer, Billete> billetes);
	}

