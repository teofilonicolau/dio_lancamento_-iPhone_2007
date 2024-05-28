package com.iphone2017.controller;

import com.iphone2017.model.ReprodutorMusical;
import com.iphone2017.model.ReprodutorMusical;
import com.iphone2017.model.AparelhoTelefonico;
import com.iphone2017.model.NavegadorInternet;

public class MediaController {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public MediaController() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }


}