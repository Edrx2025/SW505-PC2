package com.mycompany.problema4;
//Clase que no conoce a TwiloSMSClient, solo a Notificador
public class ServicioAviso {
    //Atributo propio
    private Notificador notificador;
    
    //Constructor con todos los parámetros
    public ServicioAviso(Notificador notificador){
        this.notificador=notificador;
    }
    
    //Método propio
    public void enviarMensaje(String destinatario, String mensaje){
        this.notificador.enviar(destinatario, mensaje);
    }
    
}
