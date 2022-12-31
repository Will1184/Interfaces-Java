package manejointerfaces;

import datos.AccesoDatos;
import datos.ImplementacinOracle;
import datos.ImplementacionMySql;
import excepciones.AccesoDatosEx;

public class ManejoInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacinOracle();
        ejecutar(datos,"listar");
        datos.listar();
        datos = new ImplementacionMySql();
        ejecutar(datos,"insertar");
    }
    private static void ejecutar(AccesoDatos datos,String accion) {
        if ("listar".equals(accion)) {
            datos.listar();
        }
        else if ("insertar".equals(accion)){
            datos.insertar();
        }
    }
}
