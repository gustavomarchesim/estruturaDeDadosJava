package com.gdam.estruturadados.pilhas.teste;

import com.gdam.estruturadados.pilhas.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);

        System.out.println(pilha);

        pilha.desempilha();
        pilha.desempilha();
        pilha.desempilha();

        System.out.println(pilha);

    }

}
