package org.iesvdm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MatrizGenericaTest
{
    //Creamos varias matrices, una de integer y otra de String.
    MatrizGenerica <Integer>matrizInt = new MatrizGenerica(8, 5);
    MatrizGenerica <String>matrizStr = new MatrizGenerica(5, 3);


    @Test
    public void matrizTest()
    {
        //Le damos valores a cada una.
        matrizInt.set(4, 3, 150);
        matrizStr.set(3, 2, "Hola :)");

        //Test de filas y columnas
        Assertions.assertEquals(8, matrizInt.filas());
        Assertions.assertEquals(5, matrizInt.columnas());

        Assertions.assertEquals(5, matrizStr.filas());
        Assertions.assertEquals(3, matrizStr.columnas());

        //Test de los elementos que contienen
        Assertions.assertEquals(150, matrizInt.get(4, 3));
        Assertions.assertNull(matrizInt.get(1, 1));

        Assertions.assertEquals("Hola :)", matrizStr.get(3, 2));
        Assertions.assertNull(matrizStr.get(1, 1));

    }
}
