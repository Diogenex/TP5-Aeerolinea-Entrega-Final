package com.utnmdp.aerolinea.entidades;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProvinciaTest {

    Provincia provincia;
    Provincia provincia2;
    Provincia provincia3;

    @Before
    public void iniciar(){
        provincia = new Provincia();
        provincia2 = new Provincia("Buenos Aires");
        provincia3 = new Provincia(1,"San Juan");
        provincia.setId_provincia(2);
        provincia.setNombre_provincia("La Rioja");
    }
    @Test
    public void testGetId_provincia() {
        assertEquals("Checking getId_provincia", provincia.getId_provincia(),2);
    }

    @Test
    public void testGetId_provinciaNull() {
        assertEquals("Checking getId_provinciaNull", provincia2.getId_provincia(),0);
    }

    @Test
    public void testGetNombre_provincia() {
        assertEquals("Checking getNombre_Provincia", provincia.getNombre_provincia(),"La Rioja");
    }

    @Test
    public void testToString() {
        assertEquals("Checking toString", provincia3.toString(),"Provincia{nombre_provincia='San Juan'}");
    }

}