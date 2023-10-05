package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListaOrdenadaTest
{
    //Creamos la lista
    ListaOrdenada<String> listaOrdenada = new ListaOrdenada<>();

    @Test
    public void testLista()
    {
        //Comprobamos si esta vacia
        Assertions.assertTrue(listaOrdenada.isEmpty());

        //Añadimos nombres a la lista
        listaOrdenada.add("Juan");
        listaOrdenada.add("Pedro");
        listaOrdenada.add("Ana");

        //Comrobamos la creacion correcta
        Assertions.assertNotNull(listaOrdenada);

        //Comprobamos la funcion get
        Assertions.assertEquals("Pedro", listaOrdenada.get(2));//Al haber sido ordenada internamente, Pedro pasa a la posicion 2

        //Comprobamos el tamaño
        Assertions.assertEquals(3, listaOrdenada.size());

        //Comprobamos si esta vacia otravez
        Assertions.assertFalse(listaOrdenada.isEmpty());

        //Comprobamos si borra el objeto
        Assertions.assertFalse(listaOrdenada.remove("Federico"));
        Assertions.assertTrue(listaOrdenada.remove("Juan"));

        //Comprobamos la posición
        Assertions.assertEquals(0, listaOrdenada.indexOf("Ana"));

    }

}
