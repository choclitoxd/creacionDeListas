package listaSimple;

import pila.Pila;

public class ListaSimple<E extends Comparable> {

    private Nodo<E> inicio;
    private int size;

    public ListaSimple() {
        inicio = null;
        size = 0;
    }
    public void agregarNodo(E n) {
        Nodo<E> nuevo = new Nodo<E>(n);
        nuevo.setProximo(inicio);
        inicio = nuevo;
        size++;
    }

    public void insertarFinal (E elemento){
        Nodo<E> nuevo = new Nodo<E>(elemento);
        if (inicio == null){
            inicio = nuevo;
        }
        else {
            Nodo<E> actual = inicio;
            while (actual.getProximo()!= null){
                actual = actual.getProximo();

            }
            actual.setProximo(nuevo);
            size++;
        }
    }

    public void insertarDespuesDeDato(E valor, E datoBuscar) {
        Nodo<E> nuevo = new Nodo<E>(valor);

        // Si la lista está vacía, simplemente insertamos al inicio
        if (inicio == null) {
            inicio = nuevo;
            size++;
            return;
        }

        // Buscamos el nodo que contiene el dato buscado
        Nodo<E> actual = inicio;
        boolean encontrado = false;

        while (actual != null) {
            if (actual.getValor() == datoBuscar) {
                encontrado = true;
                break;
            }
            actual = actual.getProximo();
        }

        // Si encontramos el nodo con el valor buscado
        if (encontrado) {
            nuevo.setProximo(actual.getProximo());
            actual.setProximo(nuevo);
            size++;
        } else {
            System.out.println("El dato " + datoBuscar + " no se encontró en la lista.");
        }
    }
    public void insertarAntesDeValor(E valor, E datoBuscar) {
        Nodo<E> nuevo = new Nodo(valor);

        // Si la lista está vacía, simplemente insertamos al inicio
        if (inicio == null) {
            inicio = nuevo;
            size++;
            return;
        }
        if (compararValores(inicio.getValor(), datoBuscar)) {//inicio.getValor() == datoBuscar
            nuevo.setProximo(inicio);
            inicio = nuevo;
            size++;
            return;
        }
        // Buscamos el nodo que contiene el dato buscado
        Nodo actual = inicio;
        boolean encontrado = false;

        while (actual.getProximo() != null) {
            if (actual.getProximo().getValor() == datoBuscar) {
                encontrado = true;
                break;
            }
            actual = actual.getProximo();
        }

        // Si encontramos el nodo con el valor buscado
        if (encontrado) {
            nuevo.setProximo(actual.getProximo());
            actual.setProximo(nuevo);
            size++;
        } else {
            System.out.println("El dato " + datoBuscar + " no se encontró en la lista.");
        }
    }

    public String mostrarLista() {
        if (inicio == null) {
            return "Lista vacía";
        }
        Nodo<E> recorrido = inicio;
        String lista = recorrido.getValor() + ""; // Start with the first node

        while (recorrido.getProximo() != null) {
            recorrido = recorrido.getProximo(); // Update recorrido!
            lista += "=>" + recorrido.getValor();
        }

        return lista;
    }

    public int getSize() {
        return size;
    }

    public void intecalarListaSimple(ListaSimple<E> listaSimple1, ListaSimple<E> listaSimple2) {
        int iterador = 0;
        while (listaSimple1.inicio != null || listaSimple2.inicio != null) {
            if (listaSimple1.inicio != null && iterador % 2 == 0) {
                insertarFinal(listaSimple1.inicio.getValor());
                listaSimple1.inicio = listaSimple1.inicio.getProximo();
            } else if (listaSimple2.inicio != null && iterador % 2 == 1) {
                insertarFinal(listaSimple2.inicio.getValor());
                listaSimple2.inicio = listaSimple2.inicio.getProximo();
            }
            iterador++;
        }
    }

    public void invertirListaSimpleAux(ListaSimple<E> listaSimple1) {
        Nodo<E> recorrido = listaSimple1.inicio;
        while (recorrido != null) {
            agregarNodo(recorrido.getValor());
            recorrido = recorrido.getProximo();
            size++;
        }
    }
    public void invertirListaSimple() {
        Nodo<E> previo = null;
        Nodo<E> actual = inicio;
        Nodo<E> siguiente = null;

        while (actual != null) {
            System.out.println(actual.getValor());
            siguiente = actual.getProximo(); // Guardar referencia del siguiente nodo
            actual.setProximo(previo); // Invertir la dirección del enlace
            previo = actual; // Mover previo hacia adelante
            actual = siguiente; // Mover actual hacia adelante
        }

        inicio = previo;
    }

    public void eliminarDuplicados(){
        Nodo<E> actual = inicio;

        while (actual != null) {
            Nodo<E> prev = actual;
            Nodo<E> siguiente = actual.getProximo();

            while (siguiente != null) {
                if (compararValores(siguiente.getValor(), actual.getValor())) {
                    prev.setProximo(siguiente.getProximo()); // Elimina el nodo duplicado
                } else {
                    prev = siguiente; // Avanza el nodo previo solo si no se eliminó
                }
                siguiente = siguiente.getProximo();
            }

            actual = actual.getProximo();
        }
    }

    public ListaSimple<E> dividirListaSimple() {
        if (inicio == null || inicio.getProximo() == null) {
            return new ListaSimple<>(); // Retorna una lista vacía si la original tiene 0 o 1 elemento.
        }
        Nodo<E> siguiente = inicio.getProximo();
        Nodo<E> actual = inicio;
        ListaSimple<E> nuevaListaSimple = new ListaSimple<>();
        while (siguiente != null) {
            nuevaListaSimple.agregarNodo(siguiente.getValor());
            siguiente = siguiente.getProximo();
            actual.setProximo(siguiente.getProximo());
            actual = actual.getProximo();
            if (actual != null) {
                siguiente = actual.getProximo();
            } else {
                break;
            }

        }
        return nuevaListaSimple;
    }

    public Nodo<E> getInicio() {
        return inicio;
    }

    public ListaSimple<E> convertirPilaahListaSimple(Pila<E> pila) {
        ListaSimple<E> lista = new ListaSimple<>();
        while (!pila.estaVacia()) {
            lista.insertarFinal(pila.pop());
        }
        return lista;
    }

    public boolean compararValores(E dato1, E dato2){
        return dato1.compareTo(dato2) > 0;
    }

    public boolean estaVacia(){
        return size==0;
    }

    public E popListaSimple(){
        if (inicio == null) return null;
        E valor = inicio.getValor();
        inicio = inicio.getProximo();
        return valor;
    }


}
