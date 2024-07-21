
package com.mycompany.lsd.minhaempresa;

public class LSDMinhaEmpresa {

    public static void main(String[] args) {
               
        Funcionario f1 = new Funcionario("José", 22822, 282, 1000, 100);
        
        f1.imprimir();
        f1.aumentarSalario();
        f1.aumentarSalario(60);
        
        Funcionario f2 = new Funcionario("João", 9182, 122, 1200, 50);
        
        f2.imprimir();
        f2.aumentarSalario(20);
        
        Cliente c1 = new Cliente("Maria", 2232, "Patrocinense", "Brasileiro", 2, 1921.2);
        
        c1.imprimir();
        c1.imprimirCliente();
        
        Cliente c2 = new Cliente("Helen", 2982, "Patense", "Brasileiro", 1, 3221.2);
        
        c2.imprimir();
        c2.imprimirCliente();
        
        System.out.println("Número total de pessoas criadas: " + c2.getNumeroTotalPessoas());
        System.out.println("Número total de funcionários criados: " + f2.getNumeroTotalFuncionarios());
        
        Servico.valorComissao = 3;
        Servico.valorMaoDeObraPadrao = 40;
        
        Servico s1 = new Servico(c1, f1, 400);
        
        Servico s2 = new Servico(c2, f1, 400, 500);
        
        Servico s3 = new Servico(c2, f2, 100, 20);
        
        f1.imprimirSalarioComissao();
        f2.imprimirSalarioComissao();
    }
}
