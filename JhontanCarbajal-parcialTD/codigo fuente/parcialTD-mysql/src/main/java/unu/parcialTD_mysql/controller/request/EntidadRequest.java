package unu.parcialTD_mysql.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntidadRequest {

    private String tipoOperacion;
    private int idCliente;
    private double total;
}
