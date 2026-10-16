package com.mycompany.problema2;
import java.util.Date;

public class Contrato {
    //Atributos propios
    private String codigo;
    private String proveedor;
    private double monto;
    
    //Atributos opcionales
    private Date fechaFirma;
    private int vigenciaDias;
    private boolean clausulaPenalidad;
    private String observaciones;
    
    private Contrato(ContratoBuilder builder){
        this.codigo=builder.codigo;
        this.proveedor=builder.proveedor;
        this.monto=builder.monto;
    }
    
    //Métodos Getter
    public String getCodigo() {
        return codigo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaFirma() {
        return fechaFirma;
    }

    public int getVigenciaDias() {
        return vigenciaDias;
    }

    public boolean isClausulaPenalidad() {
        return clausulaPenalidad;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    // Clase estática Builder
    public static class ContratoBuilder {
        private String codigo;
        private String proveedor;
        private double monto;

        public ContratoBuilder() {}

        public ContratoBuilder nombre(String codigo) {
            this.codigo = codigo;
            return this; 
        }
        //faltó colocar lo demás
    }
}


   