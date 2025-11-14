package unu.parcialTD_mysql.repository;

import unu.parcialTD_mysql.model.Entidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IEntidadRepository extends CrudRepository<Entidad, Serializable> {
}
