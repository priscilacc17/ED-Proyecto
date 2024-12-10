package Modelo;

import java.util.List;

public class Ruta {
    private String idRuta;
    private String nombre;
    private List<String> paradas; // Lista de nombres de las paradas

    // Constructor
    public Ruta(String idRuta, String nombre, List<String> paradas) {
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.paradas = paradas;
    }

    // Getters y Setters
    public String getIdRuta() { return idRuta; }
    public void setIdRuta(String idRuta) { this.idRuta = idRuta; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<String> getParadas() { return paradas; }
    public void setParadas(List<String> paradas) { this.paradas = paradas; }
}
