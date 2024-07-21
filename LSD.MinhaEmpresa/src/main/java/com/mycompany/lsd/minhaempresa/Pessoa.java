package com.mycompany.lsd.minhaempresa;

public abstract class Pessoa {

    private int codigo;
    private static int codigoSequencial = 1;
    private String nome;
    private int numeroCPF;
    private static int numeroTotalPessoas = 0;
    private boolean pertenceObjeto;

    public Pessoa() {
        
    }
    
    public Pessoa(String nome, int numeroCPF) {
        this.codigo = codigoSequencial++;
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

    private void setNumeroTotalPessoas(int NumeroTotalPessoas) {
        numeroTotalPessoas = NumeroTotalPessoas;
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
