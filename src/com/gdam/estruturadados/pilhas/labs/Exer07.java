package com.gdam.estruturadados.pilhas.labs;

import java.util.Scanner;

import com.gdam.estruturadados.pilhas.Pilha;

public class Exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println("Insira o valor a ser convertido: ");
        int numero = sc.nextInt();
        int quociente = numero;

        while (quociente > 0) {
            int resto = quociente % 2;
            pilha.empilha(resto);
            quociente = quociente / 2;
        }

        System.out.println("O valor em binários de " + numero + " é igual á: " + pilha);

        sc.close();
    }
}
