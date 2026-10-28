package com.ejemplo.amigos;

import jakarta.persistence.*;
import lombok.Data;

@Data 
@Entity
@Table(name="amigos")
public class Amigos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_amigos;

    private String nombre;
    private String apellido;
    private String nivel;

}
