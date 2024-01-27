package com.grupo.service.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo.service.entidades.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
