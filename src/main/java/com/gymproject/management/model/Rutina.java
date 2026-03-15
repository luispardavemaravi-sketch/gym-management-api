package com.gymproject.management.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Rutina")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String objetivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarios_id ")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
            name = "rutina_ejercicios",
            joinColumns = @JoinColumn(name = "rutina_id"),
            inverseJoinColumns = @JoinColumn(name = "ejercicios_id"))
    private List<Ejercicio> ejercicios;


}
