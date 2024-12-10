package Modelo;

public class Empleado {
    private String idEmpleado;
    private String nombre;
    private String usuario;
    private String contraseña;

    // Constructor
    public Empleado(String idEmpleado, String nombre, String usuario, String contraseña) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
}
