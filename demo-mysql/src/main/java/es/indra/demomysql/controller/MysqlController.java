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
import org.springframework.web.bind.annotation.RestController;

import es.indra.demomysql.model.Categoria;
import es.indra.demomysql.service.MysqlService;

@RestController
public class MysqlController {

	@Autowired
	MysqlService mysqlService;

	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> getAllBlog() {
		return new ResponseEntity<List<Categoria>>(mysqlService.getAllCategoria(), HttpStatus.OK);
	}

	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> getToDoById(@PathVariable("id") int id) {
		Categoria c = this.mysqlService.getCategoriaById(id);
		if (c == null) {
			return new ResponseEntity<Categoria>(c, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Categoria>(c, HttpStatus.OK);
		}

	}
	/*
	 * @RequestMapping(value = "/blog", method = RequestMethod.POST) public
	 * ResponseEntity<Void> crearBlog(@RequestBody Blog b) { Blog blog =
	 * this.blogService.saveBlog(b);
	 * 
	 * return new ResponseEntity<Void>(HttpStatus.CREATED); }
	 */

	@RequestMapping(value = "/categoria", method = RequestMethod.POST)
	public ResponseEntity<Categoria> saveToDo(@RequestBody Categoria categoria) {
		return new ResponseEntity<Categoria>(mysqlService.saveCategoria(categoria), HttpStatus.OK);
	}

	@RequestMapping(value = "/categoria", method = RequestMethod.PUT)
	public ResponseEntity<Categoria> updateToDo(@RequestBody Categoria categoria) {
		boolean correcto = true;
		RequestEntity<Categoria> respuesta;

		if (categoria == null) {
			correcto = false;
			return new ResponseEntity<Categoria>(mysqlService.saveCategoria(categoria), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Categoria>(mysqlService.saveCategoria(categoria), HttpStatus.ACCEPTED);
		}

	}

	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeToDoById(@PathVariable("id") int id) {
		Categoria categoria = mysqlService.getCategoriaById(id);
		mysqlService.removeCategoria(categoria);
		return new ResponseEntity<String>("Categoria eliminada", HttpStatus.OK);
	}
}
