package com.trabajointegrador.SistemaDeTurno.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.trabajointegrador.SistemaDeTurno.entity.Odontologo;
import com.trabajointegrador.SistemaDeTurno.entity.Paciente;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class TurnoDto {
    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDate fechaDeTurno;
}
