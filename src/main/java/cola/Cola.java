package cola;

import listaSimple.Nodo;
import pila.Pila;

import static numeroPrimos.NumerosPrimo.esPrimo;

public class Cola <E extends Comparable>{
    private Nodo<E> inicio;
    private int size;
    public Cola() {
        inicio = null;
        size = 0;
    }

    public void insertar(E valor) {
        Nodo<E> nuevo = new Nodo(valor);
        nuevo.setProximo(inicio);
        inicio = nuevo;
        size++;
    }

    public void quitar() {
        if (inicio != null){
            E valor = inicio.getValor();
            inicio = inicio.getProximo();
            size--;
        }else {
            System.out.println("El cola esta vacio");
        }
    }

    public Cola<E> sacarNumerosPrimosDePila(Pila<E> pila) {
        while (!pila.estaVacia()) {
            E valor = pila.pop();
            if(esPrimo(Integer.parseInt(valor.toString()))){
                insertar(valor);
            }
        }
        return this;

    }

    public String mostrar() {
        if (inicio == null) {
            return "Cola vacía";
        }
        Nodo<E> recorrido = inicio;
        String cola = recorrido.getValor() + ""; // Start with the first node

        while (recorrido.getProximo() != null) {
            recorrido = recorrido.getProximo(); // Update recorrido!
            cola += "=>" + recorrido.getValor();
        }

        return cola;
    }

    public void eliminarPersonas(){
        Nodo<E> actual = inicio;

        while (actual != null) {
            Nodo<E> prev = actual;
            Nodo<E> siguiente = actual.getProximo();

            while (siguiente != null) {
                if () {
                    prev.setProximo(siguiente.getProximo()); // Elimina el nodo duplicado
                } else {
                    prev = siguiente; // Avanza el nodo previo solo si no se eliminó
                }
                siguiente = siguiente.getProximo();
            }

            actual = actual.getProximo();
        }
    }




}
