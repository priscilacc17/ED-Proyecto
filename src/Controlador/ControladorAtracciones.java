package Controlador;

import Modelo.ListaEnlazadaSimple;
import Modelo.Atraccion;
import java.util.*;

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
    public List<Atraccion> listarAtracciones() {
        List<Atraccion> listaAtracciones = new ArrayList<>();
        atracciones.recorrer((atraccion) -> {
            listaAtracciones.add(atraccion);
        });
        return listaAtracciones;
    }


    // Cambiar estado de una atracción
    public void cambiarEstado(String idAtraccion, String nuevoEstado) {
        Atraccion atraccion = atracciones.buscar((a) -> a.getIdAtraccion().equals(idAtraccion));
        if (atraccion != null) {
            atraccion.setEstado(nuevoEstado);
        }
    }
}
