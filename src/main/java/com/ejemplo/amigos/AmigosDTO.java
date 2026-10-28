package com.ejemplo.amigos;

public class AmigosDTO {

    private String nombre;
    private String apellido;
    private String nivel;
    
    public AmigosDTO(String nombre, String apellido, String nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
