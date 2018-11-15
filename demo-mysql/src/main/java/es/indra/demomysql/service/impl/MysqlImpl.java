package es.indra.demomysql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.demomysql.model.Categoria;
import es.indra.demomysql.repository.MysqlRepository;
import es.indra.demomysql.service.MysqlService;

@Component
public class MysqlImpl implements MysqlService {

	@Autowired
	MysqlRepository mysqlRepository;

	@Override
	public List<Categoria> getAllCategoria() {
		return this.mysqlRepository.findAll();
	}

	@Override
	public Categoria getCategoriaById(int id) {
		return this.mysqlRepository.getOne(id);
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		return this.mysqlRepository.save(categoria);
	}

	@Override
	public void removeCategoria(Categoria categoria) {
		this.mysqlRepository.delete(categoria);
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

}
