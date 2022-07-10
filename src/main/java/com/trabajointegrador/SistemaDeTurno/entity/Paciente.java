package com.trabajointegrador.SistemaDeTurno.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String nombre;

    @Column(length = 25, nullable = false)
    private String apellido;

    @Column(length = 15, nullable = false)
    private String dni;

    @Column(name = "fecha_de_alta")
    private LocalDate fechaDeAlta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio", referencedColumnName = "id", nullable = false)
    private Domicilio domicilio;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> turnos;

    public Paciente(String nombre, String apellido, String dni, LocalDate fechaDeAlta, Domicilio domicilio, Set<Turno> turnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeAlta = fechaDeAlta;
        this.domicilio = domicilio;
        this.turnos = turnos;
    }
}
