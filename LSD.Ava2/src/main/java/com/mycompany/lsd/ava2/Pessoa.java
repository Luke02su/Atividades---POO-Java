package com.mycompany.lsd.ava2;

public abstract class Pessoa {
    private int codigo;
    private String nome;
    private int cpf;
    private char sexo;
    
    public Pessoa(int codigo, String nome, int cpf, char sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void imprimir() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCpf());
        System.out.println("Sexo: " + this.getSexo());
    }
    
}
