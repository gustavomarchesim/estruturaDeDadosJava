package com.gdam.estruturadados.vetor.teste;

import com.gdam.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {

        @SuppressWarnings({ "unchecked", "rawtypes" })
        Lista<String> vetor = new Lista(2);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);

    }

}
