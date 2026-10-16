package com.mycompany.problema4;

public class AdaptadorTwilio implements Notificador{
    //Atributo propio
    private TwilioSMSClient twilio;
    
    //Constructor con todos los parámetros
    public AdaptadorTwilio(){
        this.twilio= new TwilioSMSClient();
    }
    
    //Sobreescritura de método
    @Override
    public void enviar(String destinatario, String mensaje){
        twilio.sendSMS(destinatario, mensaje);
    }
}
