package com.mycompany.atividade04;

public class Atividade04 {

    public static void main(String[] args) {
        
        Peca a = new Peca(001, "Cano de descarga", 210.00, 10, 300.00, "Fiat", "Uno", 2011, 2017, "Montadora V", 50.00); // instanciação de um objeto da subclasse peça
        
        a.imprimir(); // método da superclasse Produto
        a.calcularPrecoVenda(); // método polimórfico da superclasse Produto
        a.imprimirValorDetalhado(); // método polimórfico da superclasse Produto
        a.imprimirPecaNacional(); // método da subclasse PecaNacional
        
        System.out.println();
                
        PecaImportada b = new PecaImportada(002, "Para-choque", 400.00, 12, 420.00, "Chevrolet", "Celta", 2013, 2015, "Audi", 110.00, 5.02, 300.00); // instanciação de um objeto da subclasse peça importada
        
        b.imprimir(); // método da superclasse Produto
        b.imprimirValorImportacao();  // método da subclasse PecaImportada
        b.calcularPrecoVenda(); // método polimórfico da superclasse Produto
        b.imprimirValorDetalhado(); // método polimórfico da superclasse produto
        b.imprimirPecaImportada(); // método da subclasse PecaImportada
    }
}