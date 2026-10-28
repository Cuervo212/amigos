package com.ejemplo.amigos;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service 
public class AmigosServicioImp implements IAmigosServicio{
    
    IAmigosRepository iAmigosRepository;

    public AmigosServicioImp(IAmigosRepository iAmigosRepository) {
        this.iAmigosRepository = iAmigosRepository;
    }

    public Optional<Amigos> mostrarAmigo(String nombre){
        return iAmigosRepository.findByNombre(nombre);
    }
}
