package Modelo;

public class Visitante {
    private String idVisitante;
    private String nombre;
    private int edad;

    // Constructor
    public Visitante(String idVisitante, String nombre, int edad) {
        this.idVisitante = idVisitante;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getIdVisitante() { return idVisitante; }
    public void setIdVisitante(String idVisitante) { this.idVisitante = idVisitante; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
