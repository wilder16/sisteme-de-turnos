package com.trabajointegrador.SistemaDeTurno.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trabajointegrador.SistemaDeTurno.dto.PacienteDto;
import com.trabajointegrador.SistemaDeTurno.entity.Paciente;
import com.trabajointegrador.SistemaDeTurno.repository.IPacienteRepository;
import com.trabajointegrador.SistemaDeTurno.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteServiceImpl implements IPacienteService {

    private IPacienteRepository pacienteRepository;
   @Autowired
    private ObjectMapper mapper;

    @Autowired
    public PacienteServiceImpl(IPacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @Override
    public void agregarPaciente(PacienteDto pacienteDto) {
        guardarPaciente(pacienteDto);
    }

    @Override
    public PacienteDto obtenerPaciente(Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDto pacienteDto = null;
        if(paciente.isPresent())
            pacienteDto = mapper.convertValue(paciente, PacienteDto.class);
        return pacienteDto;
    }

    private void guardarPaciente(PacienteDto pacienteDto){
        Paciente paciente = mapper.convertValue(pacienteDto, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public void modificarPaciente(PacienteDto pacienteDto) {
        guardarPaciente(pacienteDto);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Set<PacienteDto> listarPaciente(PacienteDto pacienteDto) {

       List<Paciente> pacienteLis = pacienteRepository.findAll();
       Set<PacienteDto> pacientesDto = new HashSet<>();
        for ( Paciente paciente: pacienteLis ) {
            pacientesDto.add(mapper.convertValue(paciente, PacienteDto.class));
        }
        return pacientesDto;
    }
}
