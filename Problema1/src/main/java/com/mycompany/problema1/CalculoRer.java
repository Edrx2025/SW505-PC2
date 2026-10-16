package com.mycompany.problema1;

//Segunda Estrategia Concreta
public class CalculoRer implements EstrategiaCalculoTributario{
    //Constructor vacio
    public CalculoRer(){
    }
    
    //Sobreescritura del método
    @Override
    public double calcular(double base){
        //Se aplica IGV 18% sobre la base
        return 1.18*base;
    }
}
