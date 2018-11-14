package es.indra.beans;

public class Categoria {
	String nombre;
	int id;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categoria(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	
	

}
