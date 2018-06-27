package com.utnmdp.aerolinea.entidades;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CiudadTest {

    Ciudad ciudad;
    Ciudad ciudad2;
    Ciudad ciudad3;
    Pais paisPrueba;
    Pais paisPrueba2;

    @Before
    public void inicio(){
        ciudad = new Ciudad();
        paisPrueba = new Pais(1,"Argentina","AR");
        paisPrueba2 = new Pais(2,"Brasil","BR");
        ciudad2 = new Ciudad(1,"Mar del Plata",paisPrueba);
        ciudad3 = new Ciudad("Bahia Blanca",paisPrueba);
    }

    @Test
    public void testgetNombre_ciudad() { assertEquals("Checking get_Nombre", ciudad2.getNombre_ciudad(),"Mar del Plata");
    }

    @Test
    public void testgetNombre_ciudadNULL() { assertEquals("Checking get_Nombre_Null", ciudad.getNombre_ciudad(),null);
    }


    @Test
    public void testGetNombre_ciudad() {
        ciudad.setNombre_ciudad("Miramar");
        assertEquals("Checking get_Nombre_Null",ciudad.getNombre_ciudad(),"Miramar");
    }

    @Test
    public void testgetId_ciudad() { assertEquals("Checking getId_ciudad",ciudad2.getId_ciudad(), 1 );
    }

    @Test
    public void testSetId_ciudad() {
        ciudad.setId_ciudad(2);
        assertEquals("Checking setId_ciudad",ciudad.getId_ciudad(),2);
    }

    @Test
    public void testgetPais() {
        ciudad2.setPais(paisPrueba2);
        assertEquals("Checking getPais", ciudad3.getPais(), paisPrueba);
    }

    @Test
    public void testToString() {assertEquals("Checking To_String",ciudad3.toString(), "Ciudad{ nombre_ciudad='Bahia Blanca', pais=Pais{nombre_pais='Argentina', codigo_iso='AR'}}");
    }

}