package com.ejemplo.amigos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAmigosRepository extends JpaRepository<Amigos, Integer>{
    public Optional<Amigos> findByNombre(String nombre);
}
