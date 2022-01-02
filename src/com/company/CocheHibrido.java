package com.company;

public class CocheHibrido extends Coche {
    /**
     * Vehículos Híbridos tipos:
     * Hibrido enchufable PHEV, Hibrido HEV, Microhibridos MHEV
     *
     * **/
    String tipoMotor;
    String combustible;

    public CocheHibrido(String bateria) {
        this.tipoMotor = "Hibrido";
        this.combustible = bateria;
    }

    public CocheHibrido(String tipo, String marca, String modelo, int cilindrada, int potencia, String cambio, String bateria) {
        super(tipo, marca, modelo, cilindrada, potencia, cambio);
        this.tipoMotor = "Hibrido";
        this.combustible = bateria;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", tipoMotor='" + tipoMotor + '\'' +
                ", combustible='" + combustible + '\'';
    }
}
