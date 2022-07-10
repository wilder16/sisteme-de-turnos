package com.trabajointegrador.SistemaDeTurno.repository;

import com.trabajointegrador.SistemaDeTurno.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {
}
