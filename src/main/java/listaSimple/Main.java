package listaSimple;

public class Main {
    public static void main(String[] args) {
//        // Creamos una nueva lista
//        ListaSimple lista = new ListaSimple();
//
//        System.out.println("=== Probando ListaSimple ===");
//
//        // Agregamos elementos al inicio
//        System.out.println("\n1. Agregando elementos al inicio:");
//        lista.agregarNodo(10);
//        lista.agregarNodo(20);
//        lista.agregarNodo(30);
//        System.out.println("Lista actual: " + lista.mostrarLista());
//        System.out.println("Tamaño de la lista: " + lista.getSize());
//
//        // Insertamos elementos al final
//        System.out.println("\n2. Insertando elementos al final:");
//        lista.insertarFinal(40);
//        lista.insertarFinal(50);
//        System.out.println("Lista actual: " + lista.mostrarLista());
//        System.out.println("Tamaño de la lista: " + lista.getSize());
//
//        //        // Insertamos elemento antes de un valor específico
//        System.out.println("\n4. Insertando elementos antes de un valor específico:");
//        lista.insertarAntesDeValor(25, 30);
//        System.out.println("Lista después de insertar 25 antes de 30: " + lista.mostrarLista());
//
//        lista.insertarAntesDeValor(45, 50);
//        System.out.println("Lista después de insertar 45 antes de 50: " + lista.mostrarLista());
//
//        // Insertamos elementos después de un valor específico
//        System.out.println("\n5. Insertando elementos después de un valor específico:");
//        lista.insertarDespuesDeDato(35, 30);
//        System.out.println("Lista después de insertar 35 después de 30: " + lista.mostrarLista());
//
//        lista.insertarDespuesDeDato(55, 50);
//        System.out.println("Lista después de insertar 55 después de 50: " + lista.mostrarLista());
//        System.out.println("Tamaño de la lista: " + lista.getSize());
//
//        lista.insertarAntesDeValor(99, 999);
//        lista.insertarDespuesDeDato(99, 999);

        // Crear las dos listas simples
        ListaSimple<Integer> lista1 = new ListaSimple<>();
        ListaSimple<Integer> lista2 = new ListaSimple<>();
        ListaSimple<Integer> listaIntercalada = new ListaSimple<>();
        ListaSimple<Integer> listaInvertida = new ListaSimple<>();

        // Agregar elementos a la primera lista
        lista1.insertarFinal(1);
        lista1.insertarFinal(3);
        lista1.insertarFinal(5);

        // Agregar elementos a la segunda lista
        lista2.insertarFinal(2);
        lista2.insertarFinal(4);
        lista2.insertarFinal(6);
        lista2.insertarFinal(8);

        // Mostrar listas originales
        System.out.println("Lista 1: " + lista1.mostrarLista());
        System.out.println("Lista 2: " + lista2.mostrarLista());
//
//        // Intercalar las listas
        listaIntercalada.intecalarListaSimple(lista1, lista2);

        //Invertir la lista
//        lista1.invertirListaSimple();

//        // Mostrar la lista intercalada
        System.out.println("Lista Intercalada: " + listaIntercalada.mostrarLista());

        //Mostrar la lista invertida
//        System.out.println("Lista Invertida: " + lista1.mostrarLista());
    }
}