package com.iphone2017.model;

import com.iphone2017.model.interfaces.NavegacaoWeb;

public class NavegadorInternet implements NavegacaoWeb {
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }
}