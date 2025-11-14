package unu.parcialTD_mysql.service;

import unu.parcialTD_mysql.controller.request.EntidadRequest;
import unu.parcialTD_mysql.model.Entidad;

public interface IEntidadService {

    public Entidad Registrar(EntidadRequest request);
}