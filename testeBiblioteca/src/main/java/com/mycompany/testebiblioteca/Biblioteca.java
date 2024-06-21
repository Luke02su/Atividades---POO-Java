package com.mycompany.testebiblioteca;

public class Biblioteca {
    
    private Livro livros[];
    private final int MAX_LIVROS = 10;
    private int qtdLivros;
            
    public Biblioteca () {
        livros = new Livro[MAX_LIVROS];
        qtdLivros = 0;
    }
  
    public void lerr () {
        if (qtdLivros >= MAX_LIVROS) {
            System.out.println("Biblioteca cheia.\n");
            return;
        }
        livros[qtdLivros].ler();
        qtdLivros++;
    }
  
    public void imprimirr () {
      
        if (qtdLivros == 0) {
            System.out.println("Biblioteca vazia.\n");
            return;
        }
      
        for (int i = 0; i < qtdLivros; i++) {
            livros[i].imprimir();
        }
    }
  
    public void maiorPagina () {
      
        int maiorNumPaginas = livros[0].numPaginas;
        int livro = 0;
         
        if (qtdLivros == 0) {
              System.out.println("Biblioteca vazia.\n");
              return;
        }
         
        for (int i = 1; i < qtdLivros; i++) {
            if (maiorNumPaginas < livros[i].numPaginas) {
                maiorNumPaginas = livros[i].numPaginas;
                livro = i;
            }
        }
     livros[livro].imprimir();
    }
}
