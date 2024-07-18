package com.mycompany.testeitem;
import java.util.Scanner;

public class Item {
    private int codigo;
    private String nome;
    private double preco;
  
    public Scanner scan = new Scanner (System.in);
    
    public Item () {
        
    }

    public Item(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void inserirDados() {
        System.out.print("Código: ");
        this.setCodigo(scan.nextInt());
        System.out.print("Nome: ");
        scan.nextLine();
        this.setNome(scan.nextLine());
        System.out.print("Preço: ");
        this.setPreco(scan.nextDouble());
    }
}

