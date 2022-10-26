package peliculas.servicios;

public interface ICatalogoPeliculas {
    
   String NOMBRE_RECURSO = "Peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String buscar);
    void iniciarCatalogoPeliculas();
    
}
