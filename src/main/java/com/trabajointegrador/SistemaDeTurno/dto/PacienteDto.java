package com.trabajointegrador.SistemaDeTurno.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.trabajointegrador.SistemaDeTurno.entity.Domicilio;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Domicilio domicilio;
    private LocalDate fechaDeAlta;

}
