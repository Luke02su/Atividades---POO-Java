package com.mycompany.testebiblioteca;
import java.util.Scanner;

public class Livro {
            
    private String autor;
    private String titulo;
    public int numPaginas;
    
    public Livro () {
        this.setAutor(null);
        this.setTitulo(null);
        this.setNumPaginas(0);
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void ler() {
        
        Scanner scan = new Scanner (System.in);
   
        System.out.println("Autor: ");
        this.setAutor((scan.nextLine()));
        System.out.println("Título: ");
        this.setTitulo((scan.nextLine()));
        System.out.println("Número de paginas: ");
        this.setNumPaginas((scan.nextInt()));
    }
    
    public void imprimir() {
        
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Título" + this.getTitulo());
        System.out.println("Número de páginas: " + this.getNumPaginas());
    }
}
