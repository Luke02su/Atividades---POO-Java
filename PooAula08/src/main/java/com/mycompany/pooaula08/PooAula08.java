package com.mycompany.pooaula08;

public class PooAula08 {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Denis");
        
        Produto p1 = new Produto("Coca-Cola", 6.5);
        Produto p2 = new Produto("Água russa", 50);
        Produto p3 = new Produto("Picanha  ", 90);
        Produto p4 = new Produto("Mandioca", 7.5);
        Produto p5 = new Produto("Pão de alho", 12);
        Produto p6 = new Produto("Queijo  ", 20);
        Produto p7 = new Produto("Carvão  ", 25);
        
        Venda v1 = new Venda(cli); // agrego cliente a venda, agreguei produto a itensvenda. 
        
        v1.insereItem(p1, 5);
        v1.insereItem(p2, 3);
        v1.insereItem(p3, 5);
        v1.insereItem(p4, 3);
        v1.insereItem(p5, 5);
        v1.insereItem(p6, 3);
        v1.insereItem(p7, 2);
        
        v1.imprimirVenda();
    }
}
