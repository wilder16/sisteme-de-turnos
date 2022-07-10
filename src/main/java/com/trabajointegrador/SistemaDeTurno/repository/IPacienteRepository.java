package com.trabajointegrador.SistemaDeTurno.repository;

import com.trabajointegrador.SistemaDeTurno.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
}
