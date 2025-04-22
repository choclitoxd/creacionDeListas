package listaDoblementeEnlazada;

import listaSimple.Nodo;

public class NodoDoblementeEnlazado<E> {
    private E valor;
    private NodoDoblementeEnlazado<E> proximo;
    private NodoDoblementeEnlazado<E> anterior;

    public NodoDoblementeEnlazado(E valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
    public E getValor() {
        return valor;
    }
    public void setValor(E valor) {
        this.valor = valor;
    }
    public void setProximo(NodoDoblementeEnlazado<E> proximo) {
        this.proximo = proximo;
    }
    public void setAnterior(NodoDoblementeEnlazado<E> anterior) {
        this.anterior = anterior;
    }
    public NodoDoblementeEnlazado<E> getProximo() {
        return proximo;
    }
    public NodoDoblementeEnlazado<E> getAnterior() {
        return anterior;
    }
}
