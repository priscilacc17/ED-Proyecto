package Main;

import Controlador.*;
import Modelo.*;
import Vista.Login;

public class Main2 {
    public static void main(String[] args) {
        // Crear instancia del controlador de empleados
        ControladorEmpleados controladorE = new ControladorEmpleados();
        ControladorAtracciones controladorA = new ControladorAtracciones();

        // Agregar empleados al controlador
        controladorE.agregarEmpleado(new Empleado("1", "admin", "1234", "Administrador"));
        controladorE.agregarEmpleado(new Empleado("2", "user", "abcd", "Usuario"));
        controladorE.agregarEmpleado(new Empleado("3", "user", "abcd", "Usuario"));

        // Agregar atracciones al controlador
        controladorA.agregarAtraccion(new Atraccion("1", "Montaña Rusa", 25, "Operativa"));
        controladorA.agregarAtraccion(new Atraccion("2", "Casa del Terror", 15, "Operativa"));
        controladorA.agregarAtraccion(new Atraccion("3", "Carrusel", 10, "Mantenimiento"));
        controladorA.agregarAtraccion(new Atraccion("4", "Salón de Espejos", 20, "Operativa"));

        // Listar todas las atracciones para verificar
        controladorA.listarAtracciones();

        // Inicializar y configurar el formulario de login
        Login loginForm = new Login();
        loginForm.setControlador(controladorE);
        loginForm.mostrar();
    }
}
