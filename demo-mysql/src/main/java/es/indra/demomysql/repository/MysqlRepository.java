package es.indra.demomysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.demomysql.model.Categoria;

@Repository
public interface MysqlRepository extends JpaRepository<Categoria, Integer> {

}
