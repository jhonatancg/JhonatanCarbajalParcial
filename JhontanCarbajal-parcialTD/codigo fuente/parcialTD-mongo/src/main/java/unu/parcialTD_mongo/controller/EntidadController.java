package unu.parcialTD_mongo.controller;

import unu.parcialTD_mongo.controller.request.EntidadRequest;
import unu.parcialTD_mongo.model.Entidad;
import unu.parcialTD_mongo.service.IEntidadService;
import unu.parcialTD_mongo.utils.ApiRoutes;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(ApiRoutes.EntidadRoutes.BASE)
public class EntidadController {

    private IEntidadService service;

    @PostMapping(ApiRoutes.EntidadRoutes.add)
    public ResponseEntity<Entidad> add(@RequestBody EntidadRequest request) throws RuntimeException {
        Entidad entidad = new Entidad();
        log.info("EntidadController-add {}", request.toString());
        entidad = service.Login(request.getNombre(), request.getClave());
        return ResponseEntity.status(HttpStatus.CREATED).body(entidad);
    }

}
