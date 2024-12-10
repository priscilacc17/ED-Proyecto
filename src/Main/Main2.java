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
        controladorA.agregarAtraccion(new Atraccion("1", "Montaña Rusa", "Montaña rusa de alta velocidad con giros, caídas vertiginosas y cambios de dirección inesperados. ¡Una experiencia emocionante que desafía la gravedad y deja a los pasajeros pidiendo más!",
                8, 1.2f, "Ninguno", 25, "Operativa"));
        controladorA.agregarAtraccion(new Atraccion("2", "Casa del Terror", "Recorrido espeluznante lleno de sorpresas macabras, efectos especiales y personajes aterradores. Ideal para los valientes que buscan una experiencia escalofriante y llena de adrenalina.",
                12, 0, "No recomendada para personas con problemas de corazón o nervios.",15, "Operativa"));
        controladorA.agregarAtraccion(new Atraccion("3", "Carrusel", "Un paseo clásico y encantador con caballos y figuras coloridas que giran suavemente al ritmo de la música, ofreciendo una experiencia mágica para todas las edades.",
                0, 0, "Niños pequeños deben ir acompañados de un adulto.",10, "Mantenimiento"));
        controladorA.agregarAtraccion(new Atraccion("4", "Salón de Espejos", "Un laberinto de espejos donde la confusión y las ilusiones ópticas te desafiarán a encontrar la salida. ¡Una aventura divertida y llena de risas para todos!",
                0,0,"No apto para personas con claustrofobia.",20, "Operativa"));

        // Listar todas las atracciones para verificar
        controladorA.listarAtracciones();

        // Inicializar y configurar el formulario de login
        Login loginForm = new Login();
        loginForm.setControlador(controladorE);
        loginForm.mostrar();
    }
}
