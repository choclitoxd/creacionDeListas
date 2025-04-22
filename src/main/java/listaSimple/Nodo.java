package listaSimple;

public class Nodo<E> {
    private E valor;
    private Nodo<E> proximo;
    public Nodo(E valor) {
        this.valor = valor;
        this.proximo = null;
    }
    public E getValor() {
        return valor;
    }
    public void setValor(E valor) {
        this.valor = valor;
    }
    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo<E> proximo) {
        this.proximo = proximo;
    }
}
