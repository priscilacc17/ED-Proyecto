package Modelo;

public class Atraccion {
    private String idAtraccion;
    private String nombre;
    private int capacidadMaxima;
    private String estado; // Abierta o Cerrada

    // Constructor
    public Atraccion(String idAtraccion, String nombre, int capacidadMaxima, String estado) {
        this.idAtraccion = idAtraccion;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdAtraccion() { return idAtraccion; }
    public void setIdAtraccion(String idAtraccion) { this.idAtraccion = idAtraccion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
