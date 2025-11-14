package unu.parcialTD_mongo.repository;

import unu.parcialTD_mongo.model.Entidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntidadRepository extends MongoRepository<Entidad, String> {
    public Entidad findByNombreAndClave(String nombre, String clave);
}
