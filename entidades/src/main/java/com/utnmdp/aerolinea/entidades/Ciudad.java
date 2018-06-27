package com.utnmdp.aerolinea.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Table(name = "ciudad")
@Entity
public class Ciudad
{

    // Atributos de la clase Ciudad

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //Para poder crear el objeto pero no mostralo.
    private long id_ciudad;

    @Column(name = "nombre_ciudad", nullable = false, length = 150)
    private String nombre_ciudad;

    @ManyToOne
    @JoinColumn(name="id_pais", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pais pais;

    // Antigua referencia con la clase Provincia, Se desacopló para que no figuren los datos de la clase Provincia cuando se solicitan - Pendiente a buscar mejor implementación
    /* @ManyToOne (fetch= FetchType.EAGER)
    @JoinColumn (name="id_provincia",)
    private Provincia provincia;*/

    //CONSTRUCTORES

    public Ciudad()
    {
        super();
    }

    public Ciudad(long id_ciudad, String nombre_ciudad, Pais pais) {
        this.id_ciudad = id_ciudad;
        this.nombre_ciudad = nombre_ciudad;
        this.pais = pais;
    }

    public Ciudad(String nombre_ciudad, Pais pais) {
        this.nombre_ciudad = nombre_ciudad;
        this.pais = pais;
    }


    // GETTERS

    public long getId_ciudad() {
        return id_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public Pais getPais() {
        return pais;
    }


    //SETTERS

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public void setId_ciudad(Integer id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Ciudad{" +
                " nombre_ciudad='" + nombre_ciudad + '\'' +
                ", pais=" + pais +
                '}';
    }


}