package com.iphone2017.implementations;

import com.iphone2017.interfaces.Telefonia;

public class AparelhoTelefonico implements Telefonia {
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void receberMensagem(String numero, String mensagem) {
        System.out.println("Recebendo mensagem de " + numero + ": " + mensagem);
    }
}