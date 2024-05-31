package com.gdam.estruturadados.vetor.teste;

import com.gdam.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
