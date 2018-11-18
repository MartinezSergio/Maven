package es.indra.demomysql.service;

import java.util.List;

import es.indra.demomysql.model.Categoria;
import es.indra.demomysql.model.Producto;

public interface ProductoService {
/*
	public List<Producto> getAllProducto();

	public Producto getProductoById(int id);

	public Producto saveProducto(Producto producto);

	public void removeProducto(Producto producto);

	public Categoria updateProducto(Producto producto);
*/
	Producto getProductoById(int id);

	List<Producto> getAllProducto();

	Producto updateProducto(Producto producto);

	Producto saveProducto(Producto producto);

	List<Producto> getAllProductoCat(Categoria c);

	void removeProducto(Producto producto);
}
