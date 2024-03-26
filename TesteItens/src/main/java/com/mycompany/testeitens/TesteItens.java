package com.mycompany.testeitens;

public class TesteItens {
    public static void main(String[] args) {
    
        Itens i1 = new Itens("0", "0", 0, 0);
        Itens i2 = new Itens("0", "0", 0, 0);
        Itens i3 = new Itens("0", "0", 0, 0);
        
        System.out.println("----- Atributos inicialzados com valor 0 -----\n");
        System.out.println("Numero: " + i1.getNumero() + " Descrição: " + i1.getDescricao() + " Quantidade: " + i1.getQtd() + " Preço: " + i1.getPreco());
        System.out.println("Numero: " + i2.getNumero() + " Descrição: " + i2.getDescricao() + " Quantidade: " + i2.getQtd() + " Preço: " + i2.getPreco());       
        System.out.println("Numero: " + i3.getNumero() + " Descrição: " + i3.getDescricao() + " Quantidade: " + i3.getQtd() + " Preço: " + i3.getPreco());
        
        System.out.println("\nDados modificados");
        i1.setNumero("001"); i1.setDescricao("Mouse"); i1.setQtd(-1); i1.setPreco(20);
        i2.setNumero("002"); i2.setDescricao("Teclado"); i2.setQtd(2); i2.setPreco(25);
        i3.setNumero("003"); i3.setDescricao("Fonte"); i3.setQtd(3); i3.setPreco(100);
        
        System.out.println("\n----- Impressão (quantidade só aparecerá se for maior que 0 e preço só aparecerá se for maior ou igual a 0) ----");
        System.out.println("Numero: " + i1.getNumero() + " Descrição: " + i1.getDescricao() + " Quantidade: " + i1.getQtd() + " Preço: " + i1.getPreco());
        System.out.println("Numero: " + i2.getNumero() + " Descrição: " + i2.getDescricao() + " Quantidade: " + i2.getQtd() + " Preço: " + i2.getPreco());       
        System.out.println("Numero: " + i3.getNumero() + " Descrição: " + i3.getDescricao() + " Quantidade: " + i3.getQtd() + " Preço: " + i3.getPreco());
        
        System.out.println("\n----- Valor total dos itens (preço * quantidade) -----");      
        System.out.println("Valor do item 1 R$: " + i1.getTotalItens());
        System.out.println("Valor total do item 2 R$ : " + i2.getTotalItens());
        System.out.println("Valor total do item 3 R$: " + i3.getTotalItens());
        
        System.out.println();
        
        i1.aumentarQuantidade(2);
        i2.diminuirQuantidade(2);
        i3.aumentarQuantidade(2);
        
        System.out.println("\n----- Impressão (quantidade só aparecerá se for maior que 0 e preço só aparecerá se for maior ou igual a 0) ----\");");
        System.out.println("Numero: " + i1.getNumero() + " Descrição: " + i1.getDescricao() + " Quantidade: " + i1.getQtd() + " Preço: " + i1.getPreco());
        System.out.println("Numero: " + i2.getNumero() + " Descrição: " + i2.getDescricao() + " Quantidade: " + i2.getQtd() + " Preço: " + i2.getPreco());       
        System.out.println("Numero: " + i3.getNumero() + " Descrição: " + i3.getDescricao() + " Quantidade: " + i3.getQtd() + " Preço: " + i3.getPreco());
        
        System.out.println("\n----- Valor total dos itens (preço * quantidade) -----");      
        System.out.println("Valor do item 1 R$: " + i1.getTotalItens());
        System.out.println("Valor total do item 2 R$ : " + i2.getTotalItens());
        System.out.println("Valor total do item 3 R$: " + i3.getTotalItens());
    }
}
