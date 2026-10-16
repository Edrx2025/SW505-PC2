package com.mycompany.problema4;

public class Problema4 {

    public static void main(String[] args) {
        //Testeando el patrón Adapter
        ServicioAviso servicio=new ServicioAviso(new AdaptadorTwilio());
        servicio.enviarMensaje("Hanna", "Hola, Carlos que tal?");
        
    }
}
