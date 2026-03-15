package com.gymproject.management.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private double peso;
    private double altura;

    private LocalDate fechaRegistro;




}
