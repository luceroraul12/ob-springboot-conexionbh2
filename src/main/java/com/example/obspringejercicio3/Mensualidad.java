package com.example.obspringejercicio3;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.StringJoiner;

@Entity
public class Mensualidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //Para crear
    public Mensualidad(String nombre) {
        this.nombre = nombre;
    }

    //Para modificar
    public Mensualidad(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Para eliminar
    public Mensualidad(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mensualidad.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombre='" + nombre + "'")
                .toString();
    }
}
