package com.trabajointegrador.SistemaDeTurno.service;

import com.trabajointegrador.SistemaDeTurno.dto.OdontologoDto;


import java.util.Set;

public interface IOdontoloService {

    void agregarOdontolo(OdontologoDto odontologoDto);
    OdontologoDto obtenerOdontolo(Long id);
    void modificarOdontolo(OdontologoDto odontologoDto);
    void eliminarOdontolo(Long id);
    Set<OdontologoDto> listarOdontolo(OdontologoDto odontologoDto);
}
