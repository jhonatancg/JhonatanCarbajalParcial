package unu.parcialTD_mongo.service.impl;

import unu.parcialTD_mongo.model.Entidad;
import unu.parcialTD_mongo.repository.IEntidadRepository;
import unu.parcialTD_mongo.service.IEntidadService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class EntidadService implements IEntidadService {

    private IEntidadRepository repository;

    @Override
    public Entidad Login(String nombre, String clave) {
        return repository.findByNombreAndClave(nombre, clave);
    }
}
