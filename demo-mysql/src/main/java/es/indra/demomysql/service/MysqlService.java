package es.indra.demomysql.service;

import java.util.List;

import es.indra.demomysql.model.Categoria;

public interface MysqlService {

	public List<Categoria> getAllCategoria();

	public Categoria getCategoriaById(int id);

	public Categoria saveCategoria(Categoria categoria);

	public void removeCategoria(Categoria categoria);

	public Categoria updateCategoria(Categoria categoria);
}
