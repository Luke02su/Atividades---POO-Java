package com.mycompany.testebiblioteca;

public class Biblioteca {
    
    private Livro[] livros;
    private int MAX_LIVROS;
    private int qtdLivros;
    
    public Biblioteca () {
        this.setMAX_LIVROS(2);
        this.setQtdLivros(0);
        this.setLivros(new Livro[getMAX_LIVROS()]);
    }
    
    public Livro[] getLivros() {
        return this.livros;
    }
    
    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    
    public int getMAX_LIVROS() {
        return this.MAX_LIVROS;
    }
    
    public void setMAX_LIVROS(int MAX_LIVROS){
        this.MAX_LIVROS = MAX_LIVROS;
    }
    
    public int getQtdLivros() {
        return this.qtdLivros;
    }
    
    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }
  
    public void lerr () {
        if (this.getQtdLivros() >= this.getMAX_LIVROS()) {
            System.out.println("Biblioteca cheia.\n");
            return;
        }
        this.livros[this.getQtdLivros()] = new Livro();
        this.getLivros()[this.getQtdLivros()].ler();
        this.setQtdLivros(this.getQtdLivros() + 1);
    }
  
    public void imprimirr () {
      
        if (this.getQtdLivros() == 0) {
            System.out.println("Biblioteca vazia.\n");
            return;
        }
      
        for (int i = 0; i < qtdLivros; i++) {
            this.getLivros()[i].imprimir();
        }
    }
  
    public void maiorPagina () {
      
        int maiorNumPaginas = this.getLivros()[0].getNumPaginas();
        int livro = 0;
         
        if (this.getQtdLivros() == 0) {
              System.out.println("Biblioteca vazia.\n");
              return;
        }
         
        for (int i = 1; i < qtdLivros; i++) {
            if (maiorNumPaginas < this.getLivros()[i].getNumPaginas()) {
                maiorNumPaginas = this.getLivros()[i].getNumPaginas();
                livro = i;
            }
        }
     this.getLivros()[livro].imprimir();
    }
}
