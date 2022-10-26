package peliculas.datos;

import java.util.List;
import peliculas.domain.Pelicula;
import peliculas.excepciones.*;

public interface IAccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> Listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivos) throws AccesoDatosEx;

    void borrar(String nombreArchivos) throws AccesoDatosEx;

}
