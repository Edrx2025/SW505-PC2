package com.mycompany.problema1;

//Primer Estrategia Concreta
public class CalculoRus implements EstrategiaCalculoTributario{    
    //Constructor vacio
    public CalculoRus(){
    }
    
    //Sobreescritura del método
    @Override
    public double calcular(double base){
        //No se aplica nada de IGV
        return base;
    }
}
