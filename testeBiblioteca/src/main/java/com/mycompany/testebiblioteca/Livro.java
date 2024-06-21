package com.mycompany.testebiblioteca;
import java.util.Scanner;

public class Livro {
    
    Scanner scan = new Scanner (System.in);
            
    private String autor;
    private String titulo;
    public int numPaginas;
    
    public Livro () {
        
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
        System.out.println("Autor: ");
        this.setAutor((scan.nextLine()));
        System.out.println("Titulo: ");
        this.setTitulo((scan.nextLine()));
        System.out.println("Numero de paginas: ");
        this.setNumPaginas((scan.nextInt()));
    }
    
    public void imprimir() {
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Numero de p" + this.getTitulo());
        System.out.println("Numero de paginas: " + this.getNumPaginas());
    }
}
