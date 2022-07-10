package com.trabajointegrador.SistemaDeTurno.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trabajointegrador.SistemaDeTurno.dto.OdontologoDto;
import com.trabajointegrador.SistemaDeTurno.repository.IOdontologoRepository;
import com.trabajointegrador.SistemaDeTurno.service.IOdontoloService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class OdontologoServiceImpl implements IOdontoloService {


    private IOdontologoRepository odontologoRepository;
    @Autowired
    private ObjectMapper mapper;

    public OdontologoServiceImpl(IOdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public void agregarOdontolo(OdontologoDto odontologoDto) {

    }

    @Override
    public OdontologoDto obtenerOdontolo(Long id) {
        return null;
    }

    @Override
    public void modificarOdontolo(OdontologoDto odontologoDto) {

    }

    @Override
    public void eliminarOdontolo(Long id) {

    }

    @Override
    public Set<OdontologoDto> listarOdontolo(OdontologoDto odontologoDto) {
        return null;
    }
}
