package unu.parcialTD_postgres.service;

import unu.parcialTD_postgres.controller.request.EntidadRequest;
import unu.parcialTD_postgres.model.Entidad;

import java.util.List;

public interface IEntidadService {

    public Entidad ActualizarPrecio(int id, double precio);

}
