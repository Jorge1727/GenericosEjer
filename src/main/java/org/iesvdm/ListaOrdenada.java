package org.iesvdm;

import java.util.ArrayList;

public class ListaOrdenada <T extends Comparable<T>>
{
    //Atr
    private ArrayList <T> lista;

    //Cons
    public ListaOrdenada()
    {
        lista = new ArrayList<T>();
    }

    //Met
    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    /**
     * Añade el objeto a la lista y seguidamente lo ordena con el propio compareTo
     * @param obj
     */
    public void add(T obj)
    {
        this.lista.add(obj);
        this.lista.sort(null);
    }

    /**
     * Devuelve el objeto en cuestion dada una posición.
     * @param pos
     * @return
     */
    public T get(Integer pos)
    {
        return this.lista.get(pos);
    }

    /**
     * Devuelve el tamaño de la lista.
     * @return
     */
    public int size()
    {
        return this.lista.size();
    }

    /**
     * Devuelve un booleano indicando si la lista esta vacía o no.
     * @return
     */
    public boolean isEmpty()
    {
        return this.lista.isEmpty();
    }

    /**
     * Devuelve booleano si esque el objeto pasado ha sido eliminado o no.
     * @param obj
     * @return
     */
    public boolean remove(T obj)
    {
        return this.lista.remove(obj);
    }

    /**
     * Devuelve la posicion de dicho objeto en la lista.
     * @param obj
     * @return
     */
    public int indexOf(T obj)
    {
        return this.lista.indexOf(obj);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "lista=" + lista +
                '}';
    }

    /*public static void main(String[] args)
    {
        ListaOrdenada<String> lista = new ListaOrdenada<>();

        lista.add("Juan");
        lista.add("Ana");

        System.out.println(lista.toString());

    }*/
}
