package com.trabajointegrador.SistemaDeTurno.service;

import com.trabajointegrador.SistemaDeTurno.dto.PacienteDto;
import com.trabajointegrador.SistemaDeTurno.entity.Paciente;

import java.util.Set;


public interface IPacienteService {
    void agregarPaciente(PacienteDto pacienteDto);
    PacienteDto obtenerPaciente(Long id);
    void modificarPaciente(PacienteDto pacienteDto);
    void eliminarPaciente(Long id);
    Set<PacienteDto> listarPaciente(PacienteDto pacienteDto);


}
