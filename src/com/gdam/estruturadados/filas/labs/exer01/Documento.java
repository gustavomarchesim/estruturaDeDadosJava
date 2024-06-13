package com.gdam.estruturadados.filas.labs.exer01;

public class Documento implements Comparable<Documento> {

    private String name;
    private int numeroFolhas;

    public Documento() {
    }

    public Documento(String name, int numeroFolhas) {
        this.name = name;
        this.numeroFolhas = numeroFolhas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    @Override
    public String toString() {
        return "Documento [name=" + name + ", numeroFolhas=" + numeroFolhas + "]\n";
    }

    @Override
    public int compareTo(Documento o) {
        if (this.numeroFolhas > o.getNumeroFolhas()) {
            return 1;
        } else if (this.numeroFolhas < o.getNumeroFolhas()) {
            return -1;
        }
        return 0;
    }

}
