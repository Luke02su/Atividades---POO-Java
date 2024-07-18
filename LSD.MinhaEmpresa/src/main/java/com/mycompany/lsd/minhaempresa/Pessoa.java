package com.mycompany.lsd.minhaempresa;

public class Pessoa {

    private int codigo = 0;
    private String nome;
    private int numeroCPF;
    public static int numeroTotalPessoas = 0;
    private boolean pertenceObjeto;

    public Pessoa() {
        
    }
    
    public Pessoa(String nome, int numeroCPF) {
        this.codigo++;
        this.nome = nome;
        this.numeroCPF = numeroCPF;
        this.numeroTotalPessoas++;
        this.pertenceObjeto = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public int getNumeroTotalPessoas() {
        return numeroTotalPessoas;
    }

    public void setNumeroTotalPessoas(int aNumeroTotalPessoas) {
        numeroTotalPessoas = aNumeroTotalPessoas;
    }

    public boolean isPertenceObjeto() {
        return pertenceObjeto;
    }

    public void setPertenceObjeto(boolean pertenceObjeto) {
        this.pertenceObjeto = pertenceObjeto;
    }
    
    public void imprimir () {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getNumeroCPF());
        if (pertenceObjeto) {
            System.out.println("Número total de pessoas: " + this.getNumeroTotalPessoas());
        }
    }
}
