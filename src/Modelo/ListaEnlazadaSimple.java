package Modelo;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

    // Agregar un elemento al final de la lista
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Recorrer la lista y ejecutar una acción sobre cada nodo
    public void recorrer(Accion<T> accion) {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            accion.ejecutar(temp.getDato());
            temp = temp.getSiguiente();
        }
    }

    // Buscar un elemento que cumpla con una condición
    public T buscar(Condicion<T> condicion) {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            if (condicion.cumple(temp.getDato())) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
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

    // Interface para la condición que se cumple en la búsqueda
    public interface Condicion<T> {
        boolean cumple(T dato);
    }
}
