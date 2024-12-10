package Main;

import Controlador.ControladorEmpleados;
import Modelo.Empleado;
import Vista.Login;

public class Main2 {
    public static void main(String[] args) {
        // Crear instancia del controlador de empleados
        ControladorEmpleados controlador = new ControladorEmpleados();

        // Agregar empleados al controlador
        controlador.agregarEmpleado(new Empleado("1", "admin", "1234", "Administrador"));
        controlador.agregarEmpleado(new Empleado("2", "user", "abcd", "Usuario"));
        controlador.agregarEmpleado(new Empleado("3", "user", "abcd", "Usuario"));

        // Inicializar y configurar el formulario de login
        Login loginForm = new Login();
        loginForm.setControlador(controlador);
        loginForm.mostrar();
    }
}
