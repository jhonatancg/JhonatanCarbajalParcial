package unu.parcialTD_postgres.service.impl;

import unu.parcialTD_postgres.controller.request.EntidadRequest;
import unu.parcialTD_postgres.model.Entidad;
import unu.parcialTD_postgres.repository.IEntidadRepository;
import unu.parcialTD_postgres.service.IEntidadService;
import unu.parcialTD_postgres.utils.exceptions.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class EntidadService implements IEntidadService {

    private IEntidadRepository repository;

    @Override
    public Entidad ActualizarPrecio(int id, double precio) {
        Entidad entidad = repository.findById(id).orElse(null);
        entidad.setPrecio(precio);
        return repository.save(entidad);
    }

}
