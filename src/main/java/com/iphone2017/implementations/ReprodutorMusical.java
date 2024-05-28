package com.iphone2017.implementations;


import com.iphone2017.interfaces.MediaContro;

public class ReprodutorMusical implements MediaContro.MediaControl {
        @Override
        public void play() {
            System.out.println("Reproduzindo música.");
        }

        @Override
        public void pause() {
            System.out.println("Pausando música.");
        }

        @Override
        public void stop() {
            System.out.println("Parando música.");
        }

        public void tocarMusica() {
            System.out.println("Música tocando.");
        }

        public void pausarMusica() {
            System.out.println("Música pausada.");
        }
    }

