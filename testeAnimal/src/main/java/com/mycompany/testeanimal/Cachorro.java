package com.mycompany.testeanimal;

public class Cachorro extends Animal {
    
    private String raca;
    private String nome;
    private boolean rabo;
    
    public Cachorro(String raca, String nome, boolean rabo, String cor, int qtdPatas, int qtdOlhos, String alimentacao, int idade) {
        super(cor, qtdPatas, qtdOlhos, alimentacao, idade);
        this.setRaca(raca);
        this.setNome(nome);
        this.setRabo(rabo);
    }
    
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isRabo() {
        return rabo;
    }

    public void setRabo(boolean rabo) {
        this.rabo = rabo;
    }
    
    @Override
    public void locomover () {
        System.out.println("Correndo.");
    }
    
    @Override
    public void comer () {
        System.out.println("Comendo ração.");
    }
    
    @Override
    public void emitirSom () {
        System.out.println("Au au au!");
    }
    
    public void imprimirCachorro () {
        System.out.println("--- CARACTERÍSTICAS DO CACHORRO ---");
        super.imprimirAnimal();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Rabo: " + this.isRabo());
        System.out.println("Raça: " + this.getRaca());
        System.out.println("---");
    }
}
