package com.example.obspringejercicio3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface MensualidadRepository extends JpaRepository<Mensualidad, Long> {
}
