package unu.parcialTD_mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "seguridad")
public class Entidad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nombre;
    private String clave;

}
