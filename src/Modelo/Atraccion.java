package Modelo;

public class Atraccion {
    private String idAtraccion;
    private String nombre;
    private String descr;
    private int edadMin;
    private float altMax;
    private String reqAdic;
    private int capacidadMaxima;
    private String estado; // Abierta o Cerrada

    // Constructor
    public Atraccion(String idAtraccion, String nombre, String descr, int edadMin, float altMax, String reqAdic, int capacidadMaxima, String estado) {
        this.idAtraccion = idAtraccion;
        this.nombre = nombre;
        this.descr = descr;
        this.edadMin = edadMin;
        this.altMax = altMax;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdAtraccion() { return idAtraccion; }
    public void setIdAtraccion(String idAtraccion) { this.idAtraccion = idAtraccion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescr() { return descr; }
    public void setDescr(String descr) { this.descr = descr; }

    public int getEdadMin() { return edadMin; }
    public void setEdadMin(int edadMin) { this.edadMin = edadMin; }

    public float getAltMax() { return altMax; }
    public void setAltMax(float altMax) { this.altMax = altMax; }

    public String getReqAdic() { return reqAdic; }
    public void setReqAdic(String reqAdic) { this.reqAdic = reqAdic; }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
