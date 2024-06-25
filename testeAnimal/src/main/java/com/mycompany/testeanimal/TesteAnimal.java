package com.mycompany.testeanimal;

public class TesteAnimal {

    public static void main(String[] args) {
        Cachorro c = new Cachorro ("Shitzu", "Mike Shinoda", true, "Branco", 4, 2, "Onívoro", 13);
        
        c.locomover();
        c.comer();
        c.emitirSom();
        c.imprimirCaracteristicas();
        c.setIdade(14);
        System.out.println("Idade atualizada do cachorro: " + c.getIdade());    
    }
}
