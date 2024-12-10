package Main;

import java.util.Arrays;
import java.util.Scanner;

import Controlador.*;
import Modelo.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar controladores
        ControladorEmpleados controladorEmpleados = new ControladorEmpleados();
        ControladorAtracciones controladorAtracciones = new ControladorAtracciones();
        ControladorVisitantes controladorVisitantes = new ControladorVisitantes();
        ControladorTickets controladorTickets = new ControladorTickets();
        ControladorRutas controladorRutas = new ControladorRutas();
        ControladorMinijuegos controladorMinijuegos = new ControladorMinijuegos();

        // Crear datos iniciales
        controladorEmpleados.agregarEmpleado(new Empleado("E001", "Ana Pérez", "ana", "1234"));
        controladorAtracciones.agregarAtraccion(new Atraccion("A001", "Montaña Rusa", 20, "Abierta"));
        controladorAtracciones.agregarAtraccion(new Atraccion("A002", "Casa del Terror", 15, "Cerrada"));
        controladorRutas.agregarRuta(new Ruta("R001", "Ruta Tren", Arrays.asList("Entrada", "Zona Infantil", "Zona de Comida", "Salida")));
        controladorMinijuegos.agregarParticipante(new Visitante("V001", "Carlos", 22));
        controladorMinijuegos.agregarParticipante(new Visitante("V002", "Lucía", 19));

        // Menú principal
        int opcion;
        do {
            System.out.println("\n===== Parque de Atracciones =====");
            System.out.println("1. Gestión de Empleados");
            System.out.println("2. Gestión de Atracciones");
            System.out.println("3. Gestión de Visitantes (Colas)");
            System.out.println("4. Gestión de Tickets (Pilas)");
            System.out.println("5. Paseos en Tren o Rutas (Lista Circular)");
            System.out.println("6. Minijuegos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionEmpleados(scanner, controladorEmpleados);
                    break;
                case 2:
                    gestionAtracciones(scanner, controladorAtracciones);
                    break;
                case 3:
                    gestionVisitantes(scanner, controladorVisitantes);
                    break;
                case 4:
                    gestionTickets(scanner, controladorTickets, controladorVisitantes, controladorAtracciones);
                    break;
                case 5:
                    gestionRutas(scanner, controladorRutas);
                    break;
                case 6:
                    gestionMinijuegos(scanner, controladorMinijuegos);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema! Adiós.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    // Gestión de Empleados
    private static void gestionEmpleados(Scanner scanner, ControladorEmpleados controlador) {
        System.out.println("\n-- Gestión de Empleados --");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        if (controlador.autenticar(usuario, contraseña)) {
            System.out.println("¡Bienvenido al sistema!");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }

    // Gestión de Atracciones
    private static void gestionAtracciones(Scanner scanner, ControladorAtracciones controlador) {
        System.out.println("\n-- Gestión de Atracciones --");
        controlador.listarAtracciones();
        System.out.print("¿Desea cambiar el estado de una atracción? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el ID de la atracción: ");
            String id = scanner.nextLine();
            System.out.print("Nuevo estado (Abierta/Cerrada): ");
            String estado = scanner.nextLine();
            controlador.cambiarEstado(id, estado);
            System.out.println("Estado actualizado.");
        }
    }

    // Gestión de Visitantes
    private static void gestionVisitantes(Scanner scanner, ControladorVisitantes controlador) {
        System.out.println("\n-- Gestión de Visitantes --");
        System.out.print("Agregar visitante (ID, Nombre, Edad separados por comas): ");
        String[] datos = scanner.nextLine().split(",");
        Visitante visitante = new Visitante(datos[0].trim(), datos[1].trim(), Integer.parseInt(datos[2].trim()));
        controlador.agregarVisitante(visitante);
        System.out.println("Visitante agregado a la cola.");
        System.out.println("Cola actual:");
        controlador.mostrarCola();
    }

    // Gestión de Tickets
    private static void gestionTickets(Scanner scanner, ControladorTickets controladorTickets, ControladorVisitantes controladorVisitantes, ControladorAtracciones controladorAtracciones) {
        System.out.println("\n-- Gestión de Tickets --");
        System.out.print("Generar ticket (ID Ticket, ID Visitante, ID Atracción, Fecha Hora separados por comas): ");
        String[] datos = scanner.nextLine().split(",");
        Ticket ticket = new Ticket(datos[0].trim(), datos[1].trim(), datos[2].trim(), datos[3].trim());
        controladorTickets.registrarTicket(ticket);
        System.out.println("Ticket registrado.");
        System.out.println("Último ticket registrado:");
        Ticket ultimo = controladorTickets.verUltimoTicket();
        System.out.println("ID: " + ultimo.getIdTicket() + ", Visitante: " + ultimo.getIdVisitante() +
                ", Atracción: " + ultimo.getIdAtraccion() + ", Fecha: " + ultimo.getFechaHora());
    }

    // Gestión de Rutas
    private static void gestionRutas(Scanner scanner, ControladorRutas controlador) {
        System.out.println("\n-- Gestión de Rutas --");
        controlador.listarRutas();
    }

    // Gestión de Minijuegos
    private static void gestionMinijuegos(Scanner scanner, ControladorMinijuegos controlador) {
        System.out.println("\n-- Gestión de Minijuegos --");
        System.out.print("Agregar participante (ID, Nombre, Edad separados por comas): ");
        String[] datos = scanner.nextLine().split(",");
        Visitante visitante = new Visitante(datos[0].trim(), datos[1].trim(), Integer.parseInt(datos[2].trim()));
        controlador.agregarParticipante(visitante);
        System.out.println("Participante agregado.");
        System.out.println("Participantes actuales:");
        controlador.listarParticipantes();
    }
}
