package com.mycompany.lsd.minhaempresa;

public class LSDMinhaEmpresa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Lucas", 15097588);
        
        p1.imprimir();
        
        Funcionario f1 = new Funcionario("José", 22822, 282, 1000, 100);
        
        f1.aumentarSalario();
        f1.aumentarSalario(10);
        f1.imprimir();
    }
}
