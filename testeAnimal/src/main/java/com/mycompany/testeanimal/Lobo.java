package com.mycompany.testeanimal;

public class Lobo extends Cachorro {

    public Lobo(String raca, String nome, boolean rabo, String cor, int qtdPatas, int qtdOlhos, String alimentacao, int idade) {
        super(raca, nome, rabo, cor, qtdPatas, qtdOlhos, alimentacao, idade);
    }
    
    @Override
    public void comer() {
        System.out.println("Coelho");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Auuuuu");
    }
    
    @Override
    public void imprimirCachorro () {
        System.out.println("Lobo possui as mesmas características de animal e cachorro.");
        super.imprimirCachorro();
    }
}
