package com.iftm.pooaula07;

public class PooAula07 {

    public static void main(String[] args) {
        
        Motorista x = new Motorista("Tião");
        
        Multimidia y = new Multimidia(8);
        
        Carro fusca = new Carro("Volswagen", 155); 
        fusca.setMm(y); // agregação 
        fusca.setPessoa(x); // agregação
        
        fusca.imprimir();
  
    }
}
