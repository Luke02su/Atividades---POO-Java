package com.mycompany.testepessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Atendente a = new Atendente(1, "Lucas", "0001", 'M', "172762", 1500.00, "Luke02su", "Lucas123");
        
        a.imprimir();
        a.aumentarSalario(-1);
        a.imprimir();
        
        Cliente c = new Cliente(2, "José", "0002", 'M', "82822", 10, 100);
        
        c.imprimir();
        c.emprestarItem(1);
        c.imprimir();
    }
}
