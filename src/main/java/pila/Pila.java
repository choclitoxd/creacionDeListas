package pila;

import listaSimple.ListaSimple;
import listaSimple.Nodo;

import java.util.List;

public class Pila<E extends Comparable>  {

    private Nodo<E> inicio;
    private int size;

    public Pila() {
        this.inicio = null;
        this.size = 0;
    }
    public void push(E n) {
        Nodo<E> nuevo = new Nodo<E>(n);
        nuevo.setProximo(inicio);
        inicio = nuevo;
        size++;
    }

    public E pop() {
        if (inicio == null) return null;
        E valor = inicio.getValor();
        inicio = inicio.getProximo();
        size--;
        return valor;
    }

    public ListaSimple<E> invertirListaSimple(ListaSimple<E> lista) {
        Nodo<E> recorrido = lista.getInicio();
        while (recorrido != null) {
            push(recorrido.getValor());
            recorrido = recorrido.getProximo();
        }
        ListaSimple<E> retorno = new ListaSimple<>();

        return retorno.convertirPilaahListaSimple(this);
    }

    public Boolean estaVacia() {
        return size == 0;
    }

    public void representacionBinaria(E valor) {
        int numero = Integer.parseInt(valor.toString());

        if (numero == 0) {
            push((E) Integer.valueOf(0));
            return;
        }

        while (numero > 0) {
            push((E) Integer.valueOf(numero % 2));
            numero = numero / 2;
        }
    }

    public boolean balanceado(String texto){

       ingresarListaAhPila(texto.split(""));

        int corchete = 0;
        int llaves = 0;
        int parentisis = 0;

        while (!estaVacia()) {
            Character valor = Character.valueOf(pop().toString().charAt(0)) ;
            switch (valor){
                case'{':
                    corchete++;
                    break;
                    case '}':
                        corchete--;
                        break;
                        case '[':
                            llaves++;
                            break;
                            case ']':
                                llaves--;
                                break;
                                case '(':
                                    parentisis++;
                                    break;
                case ')':
                    parentisis--;
                    break;
            }
        }
        return (corchete == 0 && llaves == 0 && parentisis == 0);
    }

    public void ingresarListaAhPila(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            push((E) lista[i]);
        }
        System.out.println("Listo");
    }


}
