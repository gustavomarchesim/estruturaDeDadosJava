package com.gdam.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("Lendo o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando número par: " + numero);
                par.empilha(numero);

                if (par.estaVazia()) {
                    System.out.println("Pilha dos pares vazia");
                }
            } else {
                System.out.println("Empilhando número impar: " + numero);
                impar.empilha(numero);

                if (impar.estaVazia()) {
                    System.out.println("Pilha dos impares vazia");
                }
            }

            if (numero == 0) {
                System.out.println("Número igual a 0, desempilhando de ambas as pilhas..");
                par.desempilha();
                impar.desempilha();
            }
        }

        System.out.println("Desempilhando pilhas...");
        while (!impar.estaVazia() && !par.estaVazia()) {
            System.out.println("Desempilhando número par: " + par.desempilha());
            System.out.println("Desempilhando número impar: " + impar.desempilha());
        }
        System.out.println("Todas as pilhas desempilhadas...");
        sc.close();
    }
}