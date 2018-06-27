package com.utnmdp.aerolinea.entidades;

import javax.persistence.*;
import java.util.Objects;


@Table(name = "aeropuerto")
@Entity
public class Aeropuerto
{

    // Atributos de la clase Aeropuerto

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aeropuerto")
    private long id_aeropuerto;

    @Column(name = "nombre_aeropuerto", nullable = false, length = 150)
    private String nombre_aeropuerto;

    @Column(name = "codigo_iata", nullable = false, length = 3,unique = true)
    private String codigo_iata;

    @Column(name = "longitud")
    private float longitud;

    @Column(name = "latitud")
    private float latitud;

    @ManyToOne
    @JoinColumn(name="id_ciudad", nullable = false)
    private Ciudad ciudad;

    // Contructores

    public Aeropuerto(){
        super();
    }

    public Aeropuerto(long id_aeropuerto, String nombre_aeropuerto, String codigo_iata, Float longitud, Float latitud, Ciudad ciudad) {
        this.id_aeropuerto = id_aeropuerto;
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.codigo_iata = codigo_iata;
        this.longitud = longitud;
        this.latitud = latitud;
        this.ciudad = ciudad;
    }

    public Aeropuerto(String nombre_aeropuerto, String codigo_iata, Float longitud, Float latitud, Ciudad ciudad) {
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.codigo_iata = codigo_iata;
        this.longitud = longitud;
        this.latitud = latitud;
        this.ciudad = ciudad;
    }

    // Getters

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getCodigo_iata() {
        return codigo_iata;
    }

    public long getId_aeropuerto() {
        return id_aeropuerto;
    }

    public String getNombre_aeropuerto() { return nombre_aeropuerto; }

    public float getLongitud() { return longitud; }

    public float getLatitud() { return latitud; }


    //Setters

    public void setId_aeropuerto(long id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public void setCodigo_iata(String codigo_iata) {
        this.codigo_iata = codigo_iata;
    }

    public void setNombre_aeropuerto(String nombre_aeropuerto) {
        this.nombre_aeropuerto = nombre_aeropuerto;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "Aeropuerto{" +
                ", nombre_aeropuerto='" + nombre_aeropuerto + '\'' +
                ", codigo_iata='" + codigo_iata + '\'' +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                ", ciudad=" + ciudad +
                '}';
    }

    //Metodo Equals a implementar


}