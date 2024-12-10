package Controlador;

import Modelo.*;

public class ControladorRutas {
    private ListaEnlazadaCircular<Ruta> rutas;

    public ControladorRutas() {
        rutas = new ListaEnlazadaCircular<>();
    }

    // Agregar ruta
    public void agregarRuta(Ruta ruta) {
        rutas.agregar(ruta);
    }

    // Mostrar todas las rutas
    public void listarRutas() {
        rutas.recorrer((ruta) -> {
            System.out.println("ID: " + ruta.getIdRuta() + ", Nombre: " + ruta.getNombre() +
                    ", Paradas: " + String.join(", ", ruta.getParadas()));
        });
    }
}
