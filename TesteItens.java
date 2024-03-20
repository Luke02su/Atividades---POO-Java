package com.mycompany.testeitens;

public class TesteItens {

    public static void main(String[] args) {
       Itens item1 = new Itens("001", "Mouse", 2, 35.00);
       Itens item2 = new Itens("002", "Teclado", 3, 100.00);
       Itens item3 = new Itens("003", "Fonte", 2, 500.00);
       
        System.out.println("Item 1 " + item1.getNumero() + ", " + item1.getDescricao() + ", " + item1.getQtd() + ", R$ " + item1.getPreco());
        System.out.println("Item 2 " + item2.getNumero() + " " + item2.getDescricao() + " " + item2.getQtd() + ", R$ " + item2.getPreco());
        System.out.println("Item 3 " + item3.getNumero() + " " + item3.getDescricao() + " " + item3.getQtd() + ", R$ " + item3.getPreco());
        
        System.out.println("\nCadastrado:");
        
        System.out.println("Valor total do item 1: R$ " + item1.getTotalItens());
        System.out.println("Valor total do item 2: R$ " + item2.getTotalItens());
        System.out.println("Valor total do item 3: R$ " + item3.getTotalItens());
        
        System.out.println();
        
        item1.aumentarQuantidade(1);
        item2.diminuirQuantidade(2);
        item3.aumentarQuantidade(-3);
        
        System.out.println("Atualizado: ");
        
        System.out.println("Valor total do item 1: R$ " + item1.getTotalItens());
        System.out.println("Valor total do item 2: R$ " + item2.getTotalItens());
        System.out.println("Valor total do item 3: R$ " + item3.getTotalItens());
    }
}
