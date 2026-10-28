package com.ejemplo.amigos;

import org.springframework.stereotype.Component;

@Component 
public class AmigosMapper {
    public AmigosDTO toDTO(Amigos amigo){

        AmigosDTO amigosDTO = new AmigosDTO(amigo.getNombre(),amigo.getApellido(),amigo.getNivel());
        return amigosDTO;

    }
}
