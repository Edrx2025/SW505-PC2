package com.mycompany.problema1;

public class Problema1 {

    public static void main(String[] args) {
        //Creando instancias de las estrategias concretas
        CalculoGeneral calculoGen= new CalculoGeneral();
        CalculoRer calculoRe= new CalculoRer();
        CalculoRus calculoRu= new CalculoRus();
        
        //Realizando pruebas con el valor de 500 soles
        Factura factura1= new Factura(calculoRu);
        Factura factura2= new Factura(calculoRe);
        Factura factura3= new Factura(calculoGen);
        
        //Mostrando resultados
        System.out.println("Calculo Rus: " + factura1.total(500));
        System.out.println("Calculo Rer: " + factura2.total(500));
        System.out.println("Calculo General: " + factura3.total(500));
        
        
    }
}
