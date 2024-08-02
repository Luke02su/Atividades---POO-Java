package com.mycompany.pooaula10;

public class Contato {
    private long id;
    private String nome;
    private String endereco;
    private String email;
    
    public Contato() {
        
    }

    public Contato(long id) {
        this.id = id;
    }

    public Contato(long id, String nome, String endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}