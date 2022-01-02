package com.company;

abstract class Coche {
    /**
     *
     * Tipo de vehículos SUV / HIBRIDO / AUTOMÁTICO / DEPORTIVO / COMPACTO
     * Marcas ALFA ROMEO / BENTLEY / SEAT / JAGUAR / KIA
     * Cilindrada
     * Potencia CV
     * Cambio Manual / Automático
     *
     *
     *
     */
    private String tipo;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int potencia;
    private String cambio;

    private Coche() {
    }

    private Coche(String tipo, String marca, String modelo, int cilindrada, int potencia, String cambio) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.cambio = cambio;
    }

    String getTipo() {
        return tipo;
    }

    void setTipo(String tipo) {
        this.tipo = tipo;
    }

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCilindrada() {
        return cilindrada;
    }

    void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    int getPotencia() {
        return potencia;
    }

    void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    String getCambio() {
        return cambio;
    }

    void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return  "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", potencia=" + potencia +
                ", cambio='" + cambio;
    }
}
