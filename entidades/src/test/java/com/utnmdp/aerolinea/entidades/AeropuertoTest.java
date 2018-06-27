package com.utnmdp.aerolinea.entidades;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AeropuertoTest {

    Aeropuerto aeropuerto;
    Aeropuerto aeropuerto2;
    Aeropuerto aeropuerto3;
    Ciudad ciudad;
    Pais pais;

    @Before
    public void setUp(){
        pais = new Pais(1,"Argentina","AR");
        ciudad = new Ciudad(1,"Buenos Aires",pais);
        aeropuerto2 = new Aeropuerto();
        aeropuerto = new Aeropuerto(1,"Ezeiza","EZE",12.34f,14.23f,ciudad);
        aeropuerto = new Aeropuerto("Piazzola","MDQ",-12.45f,24.56f,ciudad);
        aeropuerto2.setId_aeropuerto(3);
        aeropuerto2.setNombre_aeropuerto("Tigre");
        aeropuerto2.setCodigo_iata("TTT");
        aeropuerto2.setLatitud(12.12f);
        aeropuerto2.setLongitud(13.13f);
        aeropuerto2.setCiudad(ciudad);
    }

    @Test
    public void testGetCiudad() {
        assertEquals("Checking getCiudad",aeropuerto2.getCiudad(),ciudad);
    }

    @Test
    public void testGetCodigo_iata() {
        assertEquals("Checking Codigo_Iata", aeropuerto2.getCodigo_iata(),"TTT");
    }

    @Test
    public void testgetId_aeropuerto() {
        assertEquals("Checking id_aeropuerto",aeropuerto2.getId_aeropuerto(),3);
    }

    @Test
    public void getNombre_aeropuerto() {
        assertEquals("Checking getNombre",aeropuerto2.getNombre_aeropuerto(),"Tigre");
    }

}