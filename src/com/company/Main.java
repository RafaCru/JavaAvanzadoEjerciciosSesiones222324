package com.company;
/**
 * Ejercicio sesiones 22, 23,24
 *
 * Durante estos ejercicios se va a trabajar sobre las letras S, O, L de los principios SOLID, deberás:
 *
 * 1.- Crear una clase coche aplicándole el principio de responsabilidad única
 *      El principio de responsabilidad única o SRP (siglas del inglés, Single Responsibility Principle) en
 *      ingeniería de software establece que cada módulo o clase debe tener responsabilidad sobre una sola
 *      parte de la funcionalidad proporcionada por el software y esta responsabilidad debe estar encapsulada
 *      en su totalidad por la clase. Todos sus servicios deben estar estrechamente alineados con esa
 *      responsabilidad.
 *
 *
 * 2.- Continúa con el código extendiéndolo para aumentar su funcionalidad, pero sin modificarlo aplicando el
 * principio abierto/cerrado
 *      El principio de abierto/cerrado u OCP (siglas del inglés Open/Closed Principle) establece que
 *      «una entidad de software (clase, módulo, función, etc.) debe quedarse abierta para su extensión, pero
 *      cerrada para su modificación». Es decir, se debe poder extender el comportamiento de tal entidad pero
 *      sin modificar su código fuente.
 *      La denominación abierto/cerrado ha sido utilizada de dos maneras: ambas se basan en "la herencia" para
 *      resolver el aparente dilema, pero sus objetivos, técnicas y resultados son diferentes.
 *
 *
 * 3.- Crea su clases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno hibrido y aplica el
 * principio de substitución de Liskov, las subclases deben ser sustituibles por la superclase coche.
 *
 *
 * */

public class Main {

  //  private static Coches coches;

    public static void main(String[] args) {

	// write your code here


        CocheHibrido coche=new CocheHibrido("Compacto","Kia", "Ceed", 1750, 100, "Manual", "PHEV");
//        coche.setMarca("Kia");
//        coche.setModelo("Ceed");
//        coche.setTipo("Compacto");
//        coche.setCilindrada(1750);
//        coche.setPotencia(100);
//        coche.setCambio("Manual");




        CocheElectrico coche1=new CocheElectrico("Suv", "Ford", "Fiesta",1250,75, "Automatico", "FCEV");
//        coche1.setMarca("Ford");
//        coche1.setModelo("Fiesta");
//        coche1.setTipo("Suv");
//        coche1.setCilindrada(1250);
//        coche1.setPotencia(75);
//        coche1.setCambio("Automático");

        CocheCombustion coche2=new CocheCombustion("Suv", "Ford", "Mondeo", 2050, 175, "Automatico", "Gasoil");
//        coche2.setMarca("Ford");
//        coche2.setModelo("Mondeo");
//        coche2.setTipo("Suv");
//        coche2.setCilindrada(2050);
//        coche2.setPotencia(175);
//        coche2.setCambio("Automático");


        Coches coches = new Coches();
        coches.nuevoCoche(coche);
        coches.nuevoCoche(coche1);
        coches.nuevoCoche(coche2);

        System.out.println("Listado de Coches");
        coches.listarCoches();


        System.out.println("Burcar coche modelo Fiesta y Ka");
        coches.buscaCoche("Fiesta");
        coches.buscaCoche("Ka");

        System.out.println();



        coches.eliminaCoche(coche);

        System.out.println("Actualiza "+coche2.getCambio() +" a Manual ");


        coches.actualizaCoche("Ford","Mondeo","Berlina",2050,175,"Manual");
        coches.listarCoches();



    }
}
