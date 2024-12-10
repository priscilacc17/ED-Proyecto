package Controlador;

import java.util.LinkedList;
import java.util.Queue;
import Modelo.*;

public class ControladorVisitantes {
    private Queue<Visitante> colaVisitantes;

    public ControladorVisitantes() {
        colaVisitantes = new LinkedList<>();
    }

    // Agregar visitante a la cola
    public void agregarVisitante(Visitante visitante) {
        colaVisitantes.add(visitante);
    }

    // Atender visitante
    public Visitante atenderVisitante() {
        return colaVisitantes.poll();
    }

    // Mostrar la cola actual
    public void mostrarCola() {
        for (Visitante visitante : colaVisitantes) {
            System.out.println("ID: " + visitante.getIdVisitante() + ", Nombre: " + visitante.getNombre());
        }
    }
}
