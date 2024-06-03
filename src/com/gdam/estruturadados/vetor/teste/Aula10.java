package com.gdam.estruturadados.vetor.teste;

import com.gdam.estruturadados.vetor.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Tainara", "123456-789", "email@email.com");
        Contato c2 = new Contato("Contato2", "12556-789", "email2@email.com");
        Contato c3 = new Contato("Contato3", "112456-789", "email3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);

        System.out.println(vetor.busca(c2));

    }
}
