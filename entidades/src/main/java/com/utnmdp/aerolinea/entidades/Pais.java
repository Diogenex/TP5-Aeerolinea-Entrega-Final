package com.utnmdp.aerolinea.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
public class Pais{

    // Atributos de la clase Pais

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pais")
    @JsonIgnore
    private long id_pais;

    @Column(name = "nombre_pais", nullable = false, length = 100, unique = true)
    private String nombre_pais;


    @Column(name = "codigo_iso", length = 2, unique = true, nullable = false)
    private String codigo_iso;


    //Contructores

    public Pais() {
        super();
    }

    public Pais(Integer id_pais, String nombre_pais,String codigo_iso) {
        this.id_pais = id_pais;
        this.nombre_pais = nombre_pais;
        this.codigo_iso = codigo_iso;
    }

    public Pais(String nombre_pais, String codigo_iso) {
        this.nombre_pais = nombre_pais;
        this.codigo_iso = codigo_iso;
    }


    //Getters

    public long getId_pais() {
        return id_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public String getCodigo_iso() {
        return codigo_iso;
    }


    //Setters

    public void setId_pais(long id_pais) {
        this.id_pais = id_pais;
    }

    public void setCodigo_iso(String codigo_iso) {
        this.codigo_iso = codigo_iso;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }


    //Metodo ToString

    @Override
    public String toString() {
        return "Pais{" +
                "nombre_pais='" + nombre_pais + '\'' +
                ", codigo_iso='" + codigo_iso + '\'' +
                '}';
    }

    // Método equals() - Pendiente de declaración
}