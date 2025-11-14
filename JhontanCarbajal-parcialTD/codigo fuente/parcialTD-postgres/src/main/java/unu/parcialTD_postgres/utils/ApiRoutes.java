package unu.parcialTD_postgres.utils;

public class ApiRoutes {

    public static class EntidadRoutes {
        private EntidadRoutes() {
            throw new UnsupportedOperationException();
        }

        public static final String BASE = "/api/entidads";
        public static final String edit = "/ActualizarPrecio/{id}";
    }
}
