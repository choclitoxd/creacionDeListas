package preparcial;

import cola.Cola;
import pila.Pila;

public class Prueba2 {
    public static void main(String[] args) {
        // Crear una pila y agregar algunos números
        Pila<Integer> pila = new Pila<>();
        pila.push(10);
        pila.push(3);
        pila.push(4);
        pila.push(7);
        pila.push(8);
        pila.push(2);
        pila.push(11);

        // Crear una cola y pasarle los primos desde la pila
        Cola<Integer> cola = new Cola<>();
        cola = cola.sacarNumerosPrimosDePila(pila);

        // Mostrar el contenido de la cola
        System.out.println("Cola con números primos:");
        System.out.println(cola.mostrar());  // Esperado: 11, 2, 7, 3);
    }
}
