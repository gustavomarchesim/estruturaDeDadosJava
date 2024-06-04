package com.gdam.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("O elemento existe no array");
        } else {
            System.out.println("O elemento não existe no array");
        }

        int pos = arrayList.indexOf("B");
        if (pos > -1) {
            System.out.println("Elemento existe na posição: " + pos);

        } else {
            System.out.println("Elemento não existe na posição: " + pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove("B");
        arrayList.remove(0);

        System.out.println(arrayList);

        System.out.println(arrayList.size());

        System.out.println(arrayList.lastIndexOf("C"));
    }
}