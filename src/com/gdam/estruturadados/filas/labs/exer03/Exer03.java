package com.gdam.estruturadados.filas.labs.exer03;

import java.util.Random;

import com.gdam.estruturadados.filas.FilaComPrioridade;

public class Exer03 {
    public static void main(String[] args) throws InterruptedException {

        Random gerador = new Random();
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        final int MAX_ATENDIMENTOS = 10;
        int numMaxAtendimentos = 0;

        fila.enfileira(new Pessoa(1));
        fila.enfileira(new Pessoa(3));
        fila.enfileira(new Pessoa(3));

        while (!fila.estaVazia() && numMaxAtendimentos < MAX_ATENDIMENTOS) {
            System.out.println("Estado atual da fila: " + fila);
            geraSenha(fila, gerador);
            atendePessoa(fila);
            numMaxAtendimentos++;
        }
    }

    public static void geraSenha(FilaComPrioridade<Pessoa> fila, Random gerador) throws InterruptedException {
        int prioridade = gerador.nextInt(3) + 1;
        fila.enfileira(new Pessoa(prioridade));
        System.out.println("Gerou senha com prioridade " + prioridade);
        Thread.sleep(8000);
        System.out.println("Estado atual da fila: " + fila);

    }

    public static void atendePessoa(FilaComPrioridade<Pessoa> fila) throws InterruptedException {
        Pessoa atendida = fila.desenfileira();
        System.out.println("Atendendo um paciente com prioridade: " + atendida);
        Thread.sleep(4000);
    }
}
