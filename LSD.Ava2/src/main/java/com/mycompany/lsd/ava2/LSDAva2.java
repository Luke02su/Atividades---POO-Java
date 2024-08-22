package com.mycompany.lsd.ava2;

public class LSDAva2 {

    public static void main(String[] args) {
        Professor prof1 = new Professor(1, "José", 27768376, 'M', 1761, 2797.00);
        Professor prof2 = new Professor(2, "Lucas", 92732, 'M', 7383, 3997.00);
        
        prof1.imprimir();
        System.out.println("");
        prof2.imprimir();
        
        System.out.println("\nQuantidade de professores criados: " + prof1.numTotalProfessor);
        
        System.out.println("");
        
        prof1.aumentarSalario();
        System.out.println("");
        prof2.aumentarSalario(15);
        System.out.println("");
        prof1.aumentarSalario(50);
        
        System.out.println("");
        
        Projeto proj1 = new Projeto (1, "POO", prof1, 10);
        Projeto proj2 = new Projeto(2, "SQL", prof2, 3);
        
        proj1.imprimir();
        System.out.println("");
        proj2.imprimir();
        
        Pesquisa pesq1 = new Pesquisa(1, "ED", 6, 1800, "Desenvolvimento", 2, "João", 176861, 'M');
        Pesquisa pesq2 = new Pesquisa(2, "BD", 10, 6000, "DBA", 3, "Lucas", 13731, 'M');
        
        System.out.println("");
        pesq1.imprimir();
        System.out.println("");
        pesq2.imprimir();
        
    }
}
