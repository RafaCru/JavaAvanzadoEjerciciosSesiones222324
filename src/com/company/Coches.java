package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Coches{

    ArrayList<Coche> coches=new ArrayList();

    public void nuevoCoche (Coche coche){
        coches.add(coche);
    }


    public void eliminaCoche (Coche coche){
        coches.removeIf(co -> co == coche);
    }


    public void buscaCoche (String modelo){
        for (Coche co: coches) {
            if (Objects.equals(co.getModelo(), modelo)){
                System.out.println(co);
                return;
            }
        }
        System.out.println("El modelo buscado no esta disponible");
    }

    public void actualizaCoche (String marca,String modelo,String tipo,int potencia,int cilindrada,String cambio ){
        for (Coche co: coches) {
            if (Objects.equals(co.getModelo(), modelo)){
                co.setMarca(marca);
                co.setTipo(tipo);
                co.setPotencia(potencia);
                co.setCilindrada(cilindrada);
                co.setCambio(cambio);

                return;
            }
        }
    }
    public void listarCoches () {
        for (Coche co:coches) {
            System.out.println(co.toString());
        }
    }



}
