package com.mycompany.testebiblioteca;
import java.util.Scanner;

public class TesteBiblioteca {
    public static void main (String[] args) {
            
    Scanner scan = new Scanner(System.in);
    Biblioteca b = new Biblioteca();
    Livro l = new Livro();
    
    int opcao = 0;
    
        do {
        
        System.out.println("1. Ler livro.\n");
        System.out.println("2. Imprimir livros.\n");
        System.out.println("3. Imprimir livro c/ maior numero de paginas.\n");
        System.out.println("4. Sair\n");
           
        opcao = (scan.nextInt());
        
        switch(opcao) {
            case 1:
                b.lerr();
                break;
            
            case 2:
                b.imprimirr();
                break;
            
            case 3:
                b.maiorPagina();
                break;
        }
    } while (opcao != 4);

}
}