package com.company;
/**
 *
 *
 * */

public class CocheCombustion extends Coche {

    String tipoMotor;
    String combustible;

    public CocheCombustion(String combustible) {
        this.tipoMotor = "Combustion";
        this.combustible = combustible;
    }

    public CocheCombustion(String tipo, String marca, String modelo, int cilindrada, int potencia, String cambio, String combustible) {
        super(tipo, marca, modelo, cilindrada, potencia, cambio);
        this.tipoMotor = "Combustion";
        this.combustible = combustible;
    }

//    @Override
//    String getTipo() {
//        return super.getTipo();
//    }
//
//    @Override
//    void setTipo(String tipo) {
//        super.setTipo(tipo);
//    }
//
//    @Override
//    String getMarca() {
//        return super.getMarca();
//    }
//
//    @Override
//    void setMarca(String marca) {
//        super.setMarca(marca);
//    }
//
//    @Override
//    String getModelo() {
//        return super.getModelo();
//    }
//
//    @Override
//    public void setModelo(String modelo) {
//        super.setModelo(modelo);
//    }
//
//    @Override
//    public int getCilindrada() {
//        return super.getCilindrada();
//    }
//
//    @Override
//    public void setCilindrada(int cilindrada) {
//        super.setCilindrada(cilindrada);
//    }
//
//    @Override
//    public int getPotencia() {
//        return super.getPotencia();
//    }
//
//    @Override
//    public void setPotencia(int potencia) {
//        super.setPotencia(potencia);
//    }
//
//    @Override
//    public String getCambio() {
//        return super.getCambio();
//    }
//
//    @Override
//    public void setCambio(String cambio) {
//        super.setCambio(cambio);
//    }

    @Override
    public String toString() {
        return super.toString()+
                ", tipoMotor='" + tipoMotor + '\'' +
                ", combustible='" + combustible + '\'';
    }
}
