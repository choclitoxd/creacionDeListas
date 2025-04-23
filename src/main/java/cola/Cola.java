package cola;

import listaSimple.Nodo;
import model.Persona;
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
            inicio = inicio.getProximo();
            size--;
        }else {
            System.out.println("El cola esta vacio");
        }
    }

    public E poll() {
        if (inicio != null){
            E valor = inicio.getValor();
            inicio = inicio.getProximo();
            size--;
            return valor;
        }else {
            System.out.println("El cola esta vacio");
            return null;
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

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public Cola<E> eliminarPersonas(){
        Cola<E> cola = new Cola();
        while (!estaVacia()) {
            Persona valor = (Persona) poll();
            if (!(valor.getSexo().equals("Masculino") && valor.getEdad() >= 30 && valor.getEdad() <= 50)) {
                cola.insertar((E) valor);
            }
        }
        return cola;
    }


}
