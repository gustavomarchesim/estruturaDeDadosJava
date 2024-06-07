package com.gdam.estruturadados.pilhas.labs;

public class Livro {

    private String nome;
    private String autor;
    private int isbn;
    private String anoLancamento;

    public Livro() {

    }

    public Livro(String nome, String autor, int isbn, String anoLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + "]";
    }

}
