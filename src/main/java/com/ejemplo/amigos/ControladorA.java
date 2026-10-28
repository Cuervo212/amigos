package com.ejemplo.amigos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ControladorA {

    IAmigosServicio iAmigosServicio;
    AmigosMapper amigosMapper;

    public ControladorA(IAmigosServicio iAmigosServicio, AmigosMapper amigosMapper) {
        this.iAmigosServicio = iAmigosServicio;
        this.amigosMapper = amigosMapper;
    }

    @GetMapping("/Amigos")
    public ResponseEntity<AmigosDTO> mostrarAmigo(@RequestParam String nombre){
        Amigos amix = iAmigosServicio.mostrarAmigo(nombre).orElseThrow(()-> new RuntimeException("Amigo No Encontrado"));
        AmigosDTO amigosDTO = amigosMapper.toDTO(amix);
        return ResponseEntity.ok(amigosDTO);

    }
    
}
