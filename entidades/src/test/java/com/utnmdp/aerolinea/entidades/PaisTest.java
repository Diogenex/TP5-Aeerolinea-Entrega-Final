package com.utnmdp.aerolinea.entidades;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PaisTest{

    Pais pais;
    Pais pais2;
    Pais pais3;

    @Before
    public void setear(){
        pais = new Pais();
        pais2 = new Pais(2, "Brasil","BR");
        pais3 = new Pais("Uruguay","UR");
        pais.setNombre_pais("Argentina");
        pais.setCodigo_iso("AR");
        pais.setId_pais(1);
    }

    @Test
    public void testGetId_pais() {
        assertEquals("Checking Id_pais getter" , pais.getId_pais(), 1 );
    }

    @Test
    public void testGetNombre_pais() {
        assertEquals("Checking Nombre_Pais" , pais.getNombre_pais(), "Argentina" );
    }

    @Test
    public void testGetCodigo_iso() { assertEquals("Checking Codigo_iso",pais.getCodigo_iso(), "AR");
    }

    @Test
    public void testToString(){
        assertEquals("Checking To_String",pais2.toString(), "Pais{nombre_pais='Brasil', codigo_iso='BR'}");
    }


}