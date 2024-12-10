package Modelo;

public class Minijuego {
    private String idMinijuego;
    private String nombre;
    private String descripcion;
    private int capacidadMaxima; // Número máximo de participantes simultáneos
    private int participantesActuales; // Número actual de participantes
    private int totalParticipaciones; // Contador total de participaciones históricas

    // Constructor
    public Minijuego(String idMinijuego, String nombre, String descripcion, int capacidadMaxima) {
        this.idMinijuego = idMinijuego;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidadMaxima = capacidadMaxima;
        this.participantesActuales = 0;
        this.totalParticipaciones = 0;
    }

    // Getters y Setters
    public String getIdMinijuego() {
        return idMinijuego;
    }

    public void setIdMinijuego(String idMinijuego) {
        this.idMinijuego = idMinijuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getParticipantesActuales() {
        return participantesActuales;
    }

    public void setParticipantesActuales(int participantesActuales) {
        this.participantesActuales = participantesActuales;
    }

    public int getTotalParticipaciones() {
        return totalParticipaciones;
    }

    public void incrementarParticipaciones() {
        this.totalParticipaciones++;
    }

    // Métodos adicionales
    public boolean puedeAgregarParticipante() {
        return participantesActuales < capacidadMaxima;
    }

    public void agregarParticipante() {
        if (puedeAgregarParticipante()) {
            participantesActuales++;
            incrementarParticipaciones();
        } else {
            throw new IllegalStateException("Capacidad máxima alcanzada.");
        }
    }

    public void removerParticipante() {
        if (participantesActuales > 0) {
            participantesActuales--;
        } else {
            throw new IllegalStateException("No hay participantes para remover.");
        }
    }
}
