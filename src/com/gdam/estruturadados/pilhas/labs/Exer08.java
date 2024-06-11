package com.gdam.estruturadados.pilhas.labs;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer08 {
    public static void main(String[] args) {

        Pilha<Integer> original = new Pilha<>();
        Pilha<Integer> dest = new Pilha<>();
        Pilha<Integer> aux = new Pilha<>();

        original.empilha(3);
        original.empilha(2);
        original.empilha(1);
    }

    public static void torreDeHanoi(int n, Pilha<Integer> original, Pilha<Integer> dest, Pilha<Integer> aux) {

        if (n > 0) {
            torreDeHanoi(n - 1, original, aux, dest);
            dest.empilha(original.desempilha());
        }
    }

}