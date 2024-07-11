package com.mycompany.testeconta;

public class TesteConta {

    public static void main(String[] args) {
        
        Conta c1 = new Conta (1, "José", 100.00);
                
        ContaPoupanca cp1 = new ContaPoupanca(1, "Lucas", 200.00, 0.01);

        c1.imprimir();
        cp1.imprimir();
        
        
    }
}
