package com.gdam.estruturadados.vetor.labs;

import com.gdam.estruturadados.vetor.Lista;

public class Exer02 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("D");
        lista.adiciona("S");
        lista.adiciona("A");

        System.out.println(lista.ultimaPosicao("A"));

    }
}
