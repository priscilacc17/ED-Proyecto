package Controlador;

import java.util.Stack;
import Modelo.*;

public class ControladorMinijuegos {
    private Stack<Visitante> pilaParticipantes;

    public ControladorMinijuegos() {
        pilaParticipantes = new Stack<>();
    }

    // Agregar participante
    public void agregarParticipante(Visitante visitante) {
        pilaParticipantes.push(visitante);
    }

    // Atender último participante
    public Visitante atenderParticipante() {
        return pilaParticipantes.isEmpty() ? null : pilaParticipantes.pop();
    }

    // Mostrar todos los participantes
    public void listarParticipantes() {
        for (Visitante visitante : pilaParticipantes) {
            System.out.println("ID: " + visitante.getIdVisitante() + ", Nombre: " + visitante.getNombre());
        }
    }
}
