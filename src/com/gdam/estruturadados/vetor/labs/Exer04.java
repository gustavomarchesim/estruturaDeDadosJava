package com.gdam.estruturadados.vetor.labs;

import com.gdam.estruturadados.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("E");
        lista.adiciona("D");
        lista.adiciona("C");

        System.out.println(lista.obtem(3));
    }

}
