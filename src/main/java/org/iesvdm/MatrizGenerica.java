package org.iesvdm;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrizGenerica <T>
{
    //Atributos
    private T[][] matriz;//He visto mejor usar arrays normales porque pienso que es mas eficiente.

    //Constructor
    public MatrizGenerica(Integer fila, Integer columna)
    {
        this.matriz = (T[][]) new Object[fila][columna];
    }

    //Métodos
    public T[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(T[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Insertar en una posicion de la matriz el elemento.
     * @param fila
     * @param columna
     * @param elemento
     */
    public void set(Integer fila, Integer columna, T elemento)
    {
        this.matriz[fila][columna] = elemento;
    }

    /**
     * Devolverá el elemento que se encuentre en la posición que le pasemos.
     * @param fila
     * @param columna
     * @return
     */
    public T get(Integer fila, Integer columna)
    {
        T elemento = null;
        if(fila < 0 || columna < 0)
        {
            System.out.println("Introduce numeros positivos");
        }
        else
        {
            elemento = matriz[fila][columna];
        }

        return elemento;
    }

    /**
     * Devuelve el número de columnas de la matriz.
     * @return
     */
    public Integer columnas()
    {
        Integer columnas = matriz[0].length;

        return columnas;
    }

    /**
     * Devuelve el número de filas de la matriz.
     * @return
     */
    public Integer filas()
    {
        Integer columnas = matriz.length;

        return columnas;
    }

    @Override
    public String toString() {
        return "MatrizGenerica{" +
                "matriz=" + Arrays.toString(matriz) +
                '}';
    }

    /*
    public static void main(String[] args) {
        MatrizGenerica <Integer>matriz = new MatrizGenerica(5, 3);

        matriz.set(2, 2, 15);
        matriz.set(1, 2, 18);
        System.out.println(matriz.get(2, 2));

        Integer columnas = matriz.columnas();
        System.out.println(columnas);
        Integer filas = matriz.filas();
        System.out.println(filas);

    }
     */

}
