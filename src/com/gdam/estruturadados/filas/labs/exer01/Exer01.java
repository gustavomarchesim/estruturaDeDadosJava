package com.gdam.estruturadados.filas.labs.exer01;

import com.gdam.estruturadados.filas.FilaComPrioridade;

public class Exer01 {
    Documento documento;

    public static void main(String[] args) {
        FilaComPrioridade<Documento> fila = new FilaComPrioridade<>();

        criaDocumentos(5, fila);

        System.out.println(fila);

        imprimirDocumentos(fila);

    }

    public static void criaDocumentos(int quantidade, FilaComPrioridade<Documento> fila) {
        for (int i = 1; i < quantidade; i++) {
            String nome = "Documento" + i;
            int numeroFolhas = (i * 2);
            fila.enfileira(new Documento(nome, numeroFolhas));
        }
    }

    public static void imprimirDocumentos(FilaComPrioridade<Documento> fila) {
        while (!fila.estaVazia()) {
            System.out.println("Imprimindo...");

            fila.desenfileira();
        }
    }
}
