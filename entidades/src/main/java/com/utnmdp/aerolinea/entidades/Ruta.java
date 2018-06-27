package com.utnmdp.aerolinea.entidades;

import javax.persistence.*;

@Entity
@Table(name = "ruta")
public class Ruta {

    //Atributos de la clase Ruta

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta")
    private long id_ruta;

    @ManyToOne
    @JoinColumn(name="id_aeropuerto_salida",referencedColumnName="id_aeropuerto", nullable = false)
    private Aeropuerto id_aeropuerto_salida;

    @ManyToOne
    @JoinColumn(name="id_aeropuerto_llegada",referencedColumnName="id_aeropuerto", nullable = false)
    private Aeropuerto id_aeropuerto_llegada;

    @Column(name = "distancia") //Pendiente desarrollo para sacar de la distancia entre 2 ciudades por longitud y latitud. (Ahora Manual)
    private int distancia;

    //CONSTRUCTORES

    public Ruta(){
        super();
    }

    public Ruta(long id_ruta, Aeropuerto id_aeropuerto_salida, Aeropuerto id_aeropuerto_llegada, int distancia) {
        this.id_ruta = id_ruta;
        this.id_aeropuerto_salida = id_aeropuerto_salida;
        this.id_aeropuerto_llegada = id_aeropuerto_llegada;
        this.distancia = distancia;
    }

    public Ruta(Aeropuerto id_aeropuerto_salida, Aeropuerto id_aeropuerto_llegada, int distancia) {
        this.id_aeropuerto_salida = id_aeropuerto_salida;
        this.id_aeropuerto_llegada = id_aeropuerto_llegada;
        this.distancia = distancia;
    }

    //GETTERS

    public long getId_ruta() {
        return id_ruta;
    }

    public Aeropuerto getId_aeropuerto_salida() {
        return id_aeropuerto_salida;
    }

    public Aeropuerto getId_aeropuerto_llegada() {
        return id_aeropuerto_llegada;
    }

    public int getDistancia() { return distancia; }

    //SETTERS

    public void setId_ruta(long id_ruta) {
        this.id_ruta = id_ruta;
    }

    public void setId_aeropuerto_salida(Aeropuerto id_aeropuerto_salida) {
        this.id_aeropuerto_salida = id_aeropuerto_salida;
    }

    public void setId_aeropuerto_llegada(Aeropuerto id_aeropuerto_llegada) {
        this.id_aeropuerto_llegada = id_aeropuerto_llegada;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Ruta{" +
                "id_aeropuerto_salida=" + id_aeropuerto_salida +
                ",id_aeropuerto_llegada=" + id_aeropuerto_llegada +
                ",distancia=" + distancia +
                '}';
    }

    // Método equals() - Pendiente de declaración
}
