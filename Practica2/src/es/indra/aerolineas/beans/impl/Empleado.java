package es.indra.aerolineas.beans.impl;

public class Empleado extends Persona{
	
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String solicitarInfomacion() {
		return "";
	}
	

}
