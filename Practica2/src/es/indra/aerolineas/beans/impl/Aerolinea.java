/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea{
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	private Map<Integer, Billete> billetes = new HashMap<>();	
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	@Override
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	public void consultarVuelos(String origen) throws IOException {
		//System.out.println("Metodo de 1 parametro: ".concat(origen));
		ReadFile r = new ReadFile();
		List<String> vuelosEncontrados = new ArrayList<String>();
		try {
			vuelosEncontrados = r.retornarVuelos();
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String vuelo : vuelosEncontrados) {
			System.out.println(vuelo);
		}
		//r.retornarVuelos();
		
	}
	public void consultarVuelos(String origen, String destino) {
		System.out.println("El origen del vuelo es: " + origen + 
				"\nEl destino del vuelo es: " + destino);
	}
	
	public void anularVuelos(String... vuelos) {
		System.out.println("Númerod de vuelos a anular: " + vuelos.length);
	}
	
	public Map<Integer, Billete> getBilletes() {
		return billetes;
	}

	public void setBilletes(Map<Integer, Billete> billetes) {
		this.billetes = billetes;
	}

	public void verBilletesPorFecha(String fecha){
		//Map<Integer, Billete> billetes = new HashMap<>();
		for (Map.Entry<Integer, Billete> elemento : billetes.entrySet()) {
			if (elemento.getValue().getFecha().equals(fecha)) {
				System.out.println("El billete es: " + elemento.getKey());
				System.out.println("Billete completo: " + elemento.getValue().toString());
			}
		}
				
				

		
		
		
	}

	
	
	

}
