package unu.parcialTD_postgres.controller;

import unu.parcialTD_postgres.controller.request.EntidadRequest;
import unu.parcialTD_postgres.model.Entidad;
import unu.parcialTD_postgres.service.IEntidadService;
import unu.parcialTD_postgres.utils.ApiRoutes;
import unu.parcialTD_postgres.utils.Mensajes;
import unu.parcialTD_postgres.utils.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(ApiRoutes.EntidadRoutes.BASE)
public class EntidadController {

    private IEntidadService service;

    @PutMapping(ApiRoutes.EntidadRoutes.edit)
    public ResponseEntity<Entidad> edit(@PathVariable int id, @RequestBody double precio)
            throws NotFoundException {
        Entidad entidad = new Entidad();
        entidad = service.ActualizarPrecio(id, precio);
        return ResponseEntity.status(HttpStatus.CREATED).body(entidad);
    }

}
