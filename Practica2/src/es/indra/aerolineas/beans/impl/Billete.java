package es.indra.aerolineas.beans.impl;

public class Billete {
	
	private int id;
	private Vuelo vuelo;
	private Pasajero pasajero;
	private String fecha;
	private String numeroAsiento;
		
	public Billete(int id, Vuelo vuelo, Pasajero pasajero, String fecha, String numeroAsiento) {
		super();
		this.id = id;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
		this.fecha = fecha;
		this.numeroAsiento = numeroAsiento;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsociado(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public String toString() {
		return "Billete [id=" + id + ", vuelo=" + vuelo + ", pasajero=" + pasajero + ", fecha=" + fecha
				+ ", numeroAsiento=" + numeroAsiento + "]";
	}
	
	
	
	

}
