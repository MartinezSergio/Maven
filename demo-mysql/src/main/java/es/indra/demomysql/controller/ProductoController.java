package es.indra.demomysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.indra.demomysql.model.Categoria;
import es.indra.demomysql.model.Producto;
import es.indra.demomysql.service.MysqlService;
import es.indra.demomysql.service.ProductoService;

public class ProductoController {
	
	@Autowired
	ProductoService productoService;

	@RequestMapping(value = "/producto", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> getAllBlog() {
		return new ResponseEntity<List<Producto>>(productoService.getAllProducto(), HttpStatus.OK);
	}

	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
	public ResponseEntity<Producto> getToDoById(@PathVariable("id") int id) {
		Producto p = this.productoService.getProductoById(id);
		if (p == null) {
			return new ResponseEntity<Producto>(p, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Producto>(p, HttpStatus.OK);
		}

	}
	

	@RequestMapping(value = "/producto", method = RequestMethod.POST)
	public ResponseEntity<Producto> saveToDo(@RequestBody Producto producto) {
		return new ResponseEntity<Producto>(productoService.saveProducto(producto), HttpStatus.OK);
	}

	@RequestMapping(value = "/producto", method = RequestMethod.PUT)
	public ResponseEntity<Producto> updateToDo(@RequestBody Producto p) {
		Producto producto = this.productoService.updateProducto(p);

		if (producto == null) {
			return new ResponseEntity<Producto>(producto, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/producto/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeToDoById(@PathVariable("id") int id) {
		Producto producto = productoService.getProductoById(id);
		productoService.removeProducto(producto);
		return new ResponseEntity<String>("Producto eliminado", HttpStatus.OK);
	}

}
