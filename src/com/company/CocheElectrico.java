package com.company;

public class CocheElectrico extends Coche {
    /**
     * Vehículos Electricos Tipos:
     * Batería BEV, Pila de hidrógeno FCEV, Autonomía extendida EVER
     *
     * */

    String tipoMotor;
    String combustible;

    public CocheElectrico(String bateria) {
        this.tipoMotor = "Electrico";
        this.combustible = bateria;
    }

    public CocheElectrico(String tipo, String marca, String modelo, int cilindrada, int potencia, String cambio, String bateria) {
        super(tipo, marca, modelo, cilindrada, potencia, cambio);
        this.tipoMotor = "Electrico";
        this.combustible = bateria;
    }


    @Override
    public String toString() {
        return super.toString()+
                ", tipoMotor='" + tipoMotor + '\'' +
                ", combustible='" + combustible + '\'';
    }
}
