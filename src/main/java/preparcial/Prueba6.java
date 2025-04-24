package preparcial;

import listaSimple.ListaSimple;
import listaSimple.Nodo;

public class Prueba6 {
    public static int  metodoRecursivo(ListaSimple<Integer> listaSimple){
        if (listaSimple.getInicio() == null){return 0;}

        int valor = listaSimple.popListaSimple();

        int suma = valor + metodoRecursivo(listaSimple);


        System.out.println(suma);
        return suma;
    }
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();

        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);

        System.out.println("Lista original:");
        System.out.println(lista.mostrarLista());  // Asumiendo que tienes un método mostrar()
        lista.insertarFinal(2);// Insertamos el dos
        int sumaTotal = metodoRecursivo(lista);

        System.out.println("Suma total (incluyendo el 2 insertado): " + sumaTotal);

        System.out.println("Lista final:");
    }
}
