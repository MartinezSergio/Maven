package es.indra.aerolineas.beans.impl;

public class Billete {
	
	private int id;
	private Vuelo vuelo;
	private Pasajero pasajero;
	private String asiento;
	private String fecha;
	
	
	/**
	 * @param vuelo
	 * @param pasajero
	 * @param asiento
	 * @param fecha
	 */
	public Billete(int id, Vuelo vuelo, Pasajero pasajero, String asiento, String fecha) {
		super();
		this.id = id;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
		this.asiento = asiento;
		this.fecha = fecha;
	}

	public Billete() {
	}
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getFecha() {
		return fecha;
	}

	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	public Pasajero getPasajero() {
		return pasajero;
	}
	
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public String getAsiento() {
		return asiento;
	}
	
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "Billete [id=" + id + ", vuelo=" + vuelo + ", pasajero=" + pasajero + ", asiento=" + asiento + ", fecha="
				+ fecha + "]";
	}
	
	
	
	

}
