package Controlador;

import java.util.Stack;
import Modelo.*;

public class ControladorTickets {
    private Stack<Ticket> pilaTickets;

    public ControladorTickets() {
        pilaTickets = new Stack<>();
    }

    // Registrar ticket
    public void registrarTicket(Ticket ticket) {
        pilaTickets.push(ticket);
    }

    // Mostrar último ticket registrado
    public Ticket verUltimoTicket() {
        return pilaTickets.isEmpty() ? null : pilaTickets.peek();
    }

    // Mostrar todos los tickets
    public void listarTickets() {
        for (Ticket ticket : pilaTickets) {
            System.out.println("ID Ticket: " + ticket.getIdTicket() + ", Visitante: " + ticket.getIdVisitante() +
                    ", Atracción: " + ticket.getIdAtraccion() + ", Fecha: " + ticket.getFechaHora());
        }
    }
}
