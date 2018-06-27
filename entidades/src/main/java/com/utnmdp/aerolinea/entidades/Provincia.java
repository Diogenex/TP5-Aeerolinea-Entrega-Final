package com.utnmdp.aerolinea.entidades;

import javax.persistence.*;

@Table(name = "provincia")
@Entity
public class Provincia
{

        // Atributos de la Clase Provincia

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_provincia")
        private long id_provincia;


        @Column(name = "nombre_provincia" , nullable = false, length = 150)
        private String nombre_provincia;

        //Se desacopló la relación con la clase País y Ciudad para que no figuren datos cuando se solicitan - Pendiente a buscar mejor implementación
        /*@OneToOne
        @JoinColumn (name="id_pais", nullable = false)
        private Pais pais;*/

        //  public void setPais(Pais pais)
        // {
        //      this.pais = pais;
        // }

        //  public Pais getPais()
        // {
        //      return pais;
        // }


        //CONSTRUCTORES

        public Provincia(){
            super();
        }

        public Provincia(long id_provincia, String nombre_provincia) {
            this.id_provincia = id_provincia;
            this.nombre_provincia = nombre_provincia;
        }

        public Provincia(String nombre_provincia) {
            this.nombre_provincia = nombre_provincia;
        }

        // GETTERS

        public long getId_provincia()
    {
        return id_provincia;
    }

        public String getNombre_provincia()

    {
        return nombre_provincia;
    }


         //SETTERS

        public void setId_provincia(long id_provincia) {
        this.id_provincia = id_provincia;
    }

        public void setNombre_provincia(String nombre_provincia)
        {
            this.nombre_provincia = nombre_provincia;
        }


        //TOSTRING()

        @Override
        public String toString() {
            return "Provincia{" +
                    "nombre_provincia='" + nombre_provincia + '\'' +
                    '}';
        }

        // Método equals() - Pendiente de declaración

}
