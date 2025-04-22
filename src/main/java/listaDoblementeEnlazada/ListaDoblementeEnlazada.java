package listaDoblementeEnlazada;


public class ListaDoblementeEnlazada<E extends Comparable> {
    private NodoDoblementeEnlazado<E> inicio;
    private NodoDoblementeEnlazado<E> fin;
    private int size;

    public ListaDoblementeEnlazada() {
        this.inicio = null;
        size = 0;
    }
    public void insertarFinal(E elemento) {
        NodoDoblementeEnlazado<E> nuevo = new NodoDoblementeEnlazado<>(elemento);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setProximo(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }

        size++;
    }
    public void eliminarRecorriendoAtras(E elemento) {
        if (inicio == null) {
            return; // Lista vacía
        }

        NodoDoblementeEnlazado<E> actual = fin; // Necesitas tener un puntero a 'fin'

        while (actual != null) {
            if (compararValores(actual.getValor(), elemento)) {
                NodoDoblementeEnlazado<E> anterior = actual.getAnterior();
                NodoDoblementeEnlazado<E> siguiente = actual.getProximo();

                if (anterior != null) {
                    anterior.setProximo(siguiente);
                } else {
                    inicio = siguiente; // Era el primer nodo
                }

                if (siguiente != null) {
                    siguiente.setAnterior(anterior);
                } else {
                    fin = anterior; // Era el último nodo
                }

                size--;
                break; // Solo eliminar el primero que encuentra
            }
            actual = actual.getAnterior();
        }
    }
    public boolean compararValores(E dato1, E dato2){
        return dato1.compareTo(dato2) > 0;
    }
}
