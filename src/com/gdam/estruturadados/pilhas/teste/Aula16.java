package com.gdam.estruturadados.pilhas.teste;

import com.gdam.estruturadados.pilhas.Pilha;

public class Aula16 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha);
        pilha.empilha(1);
        pilha.empilha(3);
        System.out.println(pilha);
        System.out.println(pilha.espia());

    }

}
