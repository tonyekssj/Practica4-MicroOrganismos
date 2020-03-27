package org.programa;

public class MicroOrganismos {
    String nombre;
    int vidas;

    public MicroOrganismos(String nombre){
        this.nombre = nombre;
        this.vidas = 256;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public int dezplazarVidas() {
        vidas = vidas >> 1;
        return vidas;
    }

    public int finalVida() {
        vidas=0;
        return vidas;
    }

}