package es.indra.demomysql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.indra.demomysql.model.Categoria;
import es.indra.demomysql.model.Producto;
import es.indra.demomysql.repository.ProductoRepository;
import es.indra.demomysql.service.ProductoService;

public class ProductoImpl implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> getAllProducto() {
		return this.productoRepository.findAll();
	}

	@Override
	public Producto getProductoById(int id) {
		return this.productoRepository.getOne(id);
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return this.productoRepository.save(producto);
	}

	@Override
	public void removeProducto(Producto producto) {
		this.productoRepository.delete(producto);
	}

	@Override
	public Producto updateProducto(Producto producto) {
		if (this.getProductoById(producto.getId()) != null) {
			return this.productoRepository.save(producto);
		}

		return null;
	}
	public List<Producto> getAllProductoCat(Categoria c) {

		List<Producto> listaCat;

		productoRepository.findAll();
		return null;

	}

}
