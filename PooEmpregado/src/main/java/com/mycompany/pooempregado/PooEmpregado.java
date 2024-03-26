package com.mycompany.pooempregado;

public class PooEmpregado {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Lucas", "Dias", 2000); // inicializando atribuotos no construtor
        Empregado empregado2 = new Empregado("João", "Marciano", 3000);
        
        System.out.println("Salário mensal:");
        System.out.println("Empregado 1: " + empregado1.getNome() + " " + empregado1.getSobrenome() + ", R$ " + empregado1.getSalarioMensal());
        System.out.println("Empregado 2: " + empregado2.getNome() + " " + empregado2.getSobrenome() + ", R$ " + empregado2.getSalarioMensal());
        
        System.out.println("\nSalário anual:");
        System.out.println("Empregado 1: " + empregado1.getNome() + " " + empregado1.getSobrenome() + ", R$ " + empregado1.salarioAnual()); // puxa funcão retorno saalarioAnual (salarioMensal * 12)
        System.out.println("Empregado 2: " + empregado2.getNome() + " " + empregado2.getSobrenome() + ", R$ " + empregado2.salarioAnual());
        
        empregado1.aumentoSalarial(); // aplica o aumento de 10% em salarioMensal (afetando no anual)
        empregado2.aumentoSalarial(); 
        
        System.out.println("\nSalário anual com aumento de 10%: ");
        System.out.println("Empregado 1: " + empregado1.getNome() + " " + empregado1.getSobrenome() + ", R$ " + empregado1.salarioAnual()); // puxa funcão retorno saalarioAnual (salarioMensal * 12) com aumento de 10% nó salarioMensal
        System.out.println("Empregado 2: " + empregado2.getNome() + " " + empregado2.getSobrenome() + ", R$ " + empregado2.salarioAnual()); 
    }
}
