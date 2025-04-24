package listaCircular;

import listaSimple.Nodo;

public class ListaCircular<E extends Comparable> {

    private Nodo<E> inicio;
    private int size;

    public ListaCircular() {
        inicio = null;
        size = 0;
    }

    public void insertarFinal (E elemento){
        Nodo<E> nuevo = new Nodo(elemento);
        if (inicio == null){
            inicio = nuevo;
            nuevo.setProximo(inicio);
        }
        else {
            Nodo<E> actual = inicio;
            while (actual.getProximo()!= inicio){
                actual = actual.getProximo();

            }
            actual.setProximo(nuevo);
            nuevo.setProximo(inicio);

        }
        size++;
    }

    public void eliminarPrimero() {
        if (inicio == null){
            System.out.println("No existe elementos");;
        }else if (inicio.getProximo() == inicio) {
            inicio = null;
        }else {
            Nodo<E> actual = inicio.getProximo();
            while (actual!= inicio){
                actual = actual.getProximo();
            }
            inicio = inicio.getProximo();
            actual.setProximo(inicio);

        }

    }

    public String mostrarLista() {
        if (inicio == null) {
            return "Lista vacía";
        }
        Nodo<E> recorrido = inicio;
        String lista = recorrido.getValor() + ""; // Start with the first node

        while (recorrido.getProximo() != inicio) {
            recorrido = recorrido.getProximo(); // Update recorrido!
            lista += "=>" + recorrido.getValor();
        }

        return lista;
    }
}
