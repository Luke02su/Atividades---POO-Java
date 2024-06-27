package com.mycompany.testeanimal;

public class TesteAnimal {

    public static void main(String[] args) {
        Cachorro c = new Cachorro ("Shitzu", "Mike Shinoda", true, "Branco", 4, 2, "Onívoro", 13);
        
        c.locomover();
        c.comer();
        c.emitirSom();
        c.imprimirAnimal();
        c.imprimirCachorro();
        c.setIdade(14);
        System.out.println("Idade atualizada do cachorro: " + c.getIdade());
        
        Tubarao t = new Tubarao("Salgada", "Cartilagem", false, "Cinza", 0, 2, "Carnívoro", 6);
        
        t.locomover();
        t.comer();
        t.emitirSom();
        t.imprimirAnimal();
        t.imprimirTubarao();
        t.setIdade(9);
        System.out.println("Idade atualizada de tubarão: " + t.getIdade());
    }
}
