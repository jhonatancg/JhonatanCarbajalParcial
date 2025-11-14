package unu.parcialTD_postgres.repository;

import unu.parcialTD_postgres.model.Entidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IEntidadRepository extends CrudRepository<Entidad, Serializable> {
}
