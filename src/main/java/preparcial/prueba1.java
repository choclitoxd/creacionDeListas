package preparcial;

import listaSimple.ListaSimple;
import pila.Pila;

public class prueba1 {
    public static void main(String[] args) {
        // Crear la lista simple original
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);

        System.out.println("Lista original:");
        System.out.println(  lista.mostrarLista());  // Suponiendo que imprime: 1 -> 2 -> 3 -> 4 -> 5

        // Crear la pila e invertir la lista
        Pila<Integer> pila = new Pila<>();
        ListaSimple<Integer> invertida = pila.invertirListaSimple(lista);

        System.out.println("Lista invertida:");
        System.out.println(invertida.mostrarLista());  // Debería imprimir: 5 -> 4 -> 3 -> 2 -> 1
    }
}
