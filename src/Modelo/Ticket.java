package Modelo;

public class Ticket {
    private String idTicket;
    private String idVisitante;
    private String idAtraccion;
    private String fechaHora;

    // Constructor
    public Ticket(String idTicket, String idVisitante, String idAtraccion, String fechaHora) {
        this.idTicket = idTicket;
        this.idVisitante = idVisitante;
        this.idAtraccion = idAtraccion;
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public String getIdTicket() { return idTicket; }
    public void setIdTicket(String idTicket) { this.idTicket = idTicket; }

    public String getIdVisitante() { return idVisitante; }
    public void setIdVisitante(String idVisitante) { this.idVisitante = idVisitante; }

    public String getIdAtraccion() { return idAtraccion; }
    public void setIdAtraccion(String idAtraccion) { this.idAtraccion = idAtraccion; }

    public String getFechaHora() { return fechaHora; }
    public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }
}
