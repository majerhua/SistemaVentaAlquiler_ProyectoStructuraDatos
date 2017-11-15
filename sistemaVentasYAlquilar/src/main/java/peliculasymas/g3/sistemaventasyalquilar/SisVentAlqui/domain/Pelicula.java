
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;


public class Pelicula implements Serializable{
    
    
    private Integer idPelicula;
    private String categoria;
    private double precioCompra;
    private String titulo;
    private String duracion;
    private String idioma;

    public Pelicula() {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public Pelicula(Integer idPelicula, String categoria, double precioCompra, String titulo, String duracion, String idioma) {
        this.idPelicula = idPelicula;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.titulo = titulo;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    

    
    public Integer getIdPelicula() {
        return idPelicula;
    }

    
    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    
    public String getCategoria() {
        return categoria;
    }

    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public double getPrecioCompra() {
        return precioCompra;
    }

    
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getDuracion() {
        return duracion;
    }

   
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

   
    public String getIdioma() {
        return idioma;
    }

   
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    

    
    
}
