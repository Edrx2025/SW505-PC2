package com.mycompany.problema1;

public class Factura {
    //Atributo
    private EstrategiaCalculoTributario estrategia;
    
    //Constructor
    public Factura(EstrategiaCalculoTributario estrategia){
        this.estrategia=estrategia;
    }
    
    //Método propio
    public double total(double base){
        return estrategia.calcular(base);
    }
    
    //Método Getter and Setter
    public EstrategiaCalculoTributario getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstrategiaCalculoTributario estrategia) {
        this.estrategia = estrategia;
    }
    
}
