package Modelo;

public class ListaEnlazadaCircular<T> {
    private Nodo<T> cabeza;

    public ListaEnlazadaCircular() {
        cabeza = null;
    }

    // Agregar un elemento a la lista circular
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza); // El nodo apunta a sí mismo (circular)
        } else {
            Nodo<T> temp = cabeza;
            // Ir al último nodo
            while (temp.getSiguiente() != cabeza) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza); // Circular
        }
    }

    // Recorrer la lista circular y ejecutar una acción sobre cada nodo
    public void recorrer(Accion<T> accion) {
        if (cabeza != null) {
            Nodo<T> temp = cabeza;
            do {
                accion.ejecutar(temp.getDato());
                temp = temp.getSiguiente();
            } while (temp != cabeza); // Regresa al inicio de la lista
        }
    }

    // Clase Nodo para enlazar los elementos de la lista
    private static class Nodo<T> {
        private T dato;
        private Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public T getDato() {
            return dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }

    // Interface para la acción que se ejecuta sobre cada nodo
    public interface Accion<T> {
        void ejecutar(T dato);
    }
}
