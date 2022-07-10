package edu.umanizales.practicacalse.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Producto {

    @Id
    private Long id;
    private String nombre;
    private BigDecimal precio;
}
