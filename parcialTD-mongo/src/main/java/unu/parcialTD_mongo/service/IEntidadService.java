package unu.parcialTD_mongo.service;

import unu.parcialTD_mongo.model.Entidad;

public interface IEntidadService {

    public Entidad Login(String nombre, String clave);

}
