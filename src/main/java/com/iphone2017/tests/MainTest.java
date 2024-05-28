package com.iphone2017.tests;

import com.iphone2017.implementations.AparelhoTelefonico;
import com.iphone2017.implementations.NavegadorInternet;
import com.iphone2017.implementations.ReprodutorMusical;

public class MainTest {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.play();
        reprodutor.pause();
        reprodutor.stop();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.fazerChamada("123456789");
        telefone.receberChamada("987654321");
        telefone.enviarMensagem("123456789", "Olá!");
        telefone.receberMensagem("987654321", "Oi!");

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.abrirPagina("https://www.example.com");
        navegador.adicionarFavorito("https://www.example.com");
    }
}