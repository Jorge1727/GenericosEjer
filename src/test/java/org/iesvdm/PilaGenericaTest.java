package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PilaGenericaTest
{
     PilaGenerica<Integer> numeros = new PilaGenerica<>();

    @Test
    public void testPila()
    {
        //Esta vacia
        Assertions.assertTrue(numeros.estaVacia());

        //Se añaden 4 elementos
        numeros.aniadir(5);
        numeros.aniadir(4);
        numeros.aniadir(8);
        numeros.aniadir(2);

        //No está vacia
        Assertions.assertFalse(numeros.estaVacia());

        //pop a la pila
        numeros.extraer();

        //Deben quedar 3
        Assertions.assertEquals(3, numeros.getPila().size());

        //Cogemos el primero
        Assertions.assertEquals(4, numeros.primero());

        System.out.println(numeros.toString());

    }
}
