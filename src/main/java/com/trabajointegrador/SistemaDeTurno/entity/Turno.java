package com.trabajointegrador.SistemaDeTurno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_odontologo")
    private Odontologo odontologo;

    @Column(name = "fecha_de_turno", nullable = false)
    private LocalDate fechaDeTurno;

    public Turno(Paciente paciente, Odontologo odontologo, LocalDate fechaDeTurno) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaDeTurno = fechaDeTurno;
    }
}
