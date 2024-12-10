package Controlador;

import java.util.HashMap;
import Modelo.*;

public class ControladorEmpleados {
    private HashMap<String, Empleado> empleados;

    public ControladorEmpleados() {
        empleados = new HashMap<>();
    }

    // Agregar empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.put(empleado.getIdEmpleado(), empleado);
    }

    // Autenticación de login
    public boolean autenticar(String usuario, String contraseña) {
        for (Empleado empleado : empleados.values()) {
            if (empleado.getUsuario().equals(usuario) && empleado.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    // Buscar empleado por ID
    public Empleado buscarEmpleado(String id) {
        return empleados.get(id);
    }
}
