package com.gdam.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Lendo o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando número " + numero);
                pilha.empilha(numero);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia!");
                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha... " + desempilhado);
                }
            }
        }

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados");
        sc.close();
    }
}
