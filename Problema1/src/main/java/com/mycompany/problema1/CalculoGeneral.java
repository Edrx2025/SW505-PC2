package com.mycompany.problema1;

//Tercera Estrategia Concreta
public class CalculoGeneral implements EstrategiaCalculoTributario{
    //Constructor vacio
    public CalculoGeneral(){
    }
    
    //Sobreescritura del método
    @Override
    public double calcular(double base){
        //Se aplica IGV 18% sobre la base y percepción 2% sobre el total
        return base*1.20;
    }
    
}
