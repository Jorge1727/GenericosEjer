package org.iesvdm;

import java.util.LinkedList;
import java.util.List;

public class PilaGenerica <T>
{
    //Atributos
    private LinkedList <T> pila;

    //Constructor
    public PilaGenerica() {
        pila = new LinkedList<T>();
    }

    //Metodos
    public List<T> getPila() {
        return pila;
    }

    public void setPila(LinkedList<T> pila) {
        this.pila = pila;
    }

    //IsEmpty
    public boolean estaVacia()
    {
        return this.pila.isEmpty();
    }

    //Pop
    public T extraer()
    {
        return this.pila.pop();
    }

    //Peak
    public T primero()
    {
        return this.pila.peek();
    }

    //Add
    public void aniadir(T t)
    {
        this.pila.add(t);
        System.out.println("Aniadido correctamente.");
    }

    @Override
    public String toString() {
        return "PilaGenerica{" +
                "pila=" + pila +
                '}';
    }
}
