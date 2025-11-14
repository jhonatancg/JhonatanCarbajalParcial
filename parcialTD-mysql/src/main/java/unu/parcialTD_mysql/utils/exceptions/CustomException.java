package unu.parcialTD_mysql.utils.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomException extends RuntimeException {

    public CustomException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
