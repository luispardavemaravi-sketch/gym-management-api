package com.gymproject.management.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Ejercicios")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private String grupoMuscular;

    private String descripcion;

    private String urlImagen;


}
