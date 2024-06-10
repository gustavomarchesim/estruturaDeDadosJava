package com.gdam.estruturadados.pilhas.labs;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer06 {
    public static void main(String[] args) {

        testaBalanceamento("(A(+B+D)");
        testaBalanceamento("(A+B)-C");

    }

    public static boolean testaBalanceamento(String expressao) {
        Pilha<Integer> pilha = new Pilha<>();
        char abertura = '(';
        char fechamento = ')';

        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == abertura) {
                pilha.empilha(i);
            } else if (expressao.charAt(i) == fechamento) {
                if (pilha.estaVazia()) {
                    System.out.println("Expressão não balanceada");
                    return false;
                } else {
                    pilha.desempilha();
                }
            }
        }

        if (pilha.estaVazia()) {
            System.out.println("Expressão Balanceada");
            return true;
        } else {
            System.out.println("Expressão não balanceada");
            return false;
        }
    }
}
