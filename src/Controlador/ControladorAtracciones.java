package Controlador;

import Modelo.ListaEnlazadaSimple;
import Modelo.Atraccion;

public class ControladorAtracciones {
    private ListaEnlazadaSimple<Atraccion> atracciones;

    public ControladorAtracciones() {
        atracciones = new ListaEnlazadaSimple<>();
    }

    // Agregar atracción
    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.agregar(atraccion);
    }

    // Listar todas las atracciones
    public void listarAtracciones() {
        atracciones.recorrer((atraccion) -> {
            System.out.println("ID: " + atraccion.getIdAtraccion() + ", Nombre: " + atraccion.getNombre() +
                    ", Capacidad: " + atraccion.getCapacidadMaxima() + ", Estado: " + atraccion.getEstado());
        });
    }

    // Cambiar estado de una atracción
    public void cambiarEstado(String idAtraccion, String nuevoEstado) {
        Atraccion atraccion = atracciones.buscar((a) -> a.getIdAtraccion().equals(idAtraccion));
        if (atraccion != null) {
            atraccion.setEstado(nuevoEstado);
        }
    }
}
