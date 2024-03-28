package com.mycompany.atividade04;

public class Atividade04 {

    public static void main(String[] args) {
        
        Peca a = new Peca(001, "Cano de descarga", 160.00, 10, 150.00, "Fiat", "Uno", 2011, 2017, "Montadora V", 10.00);
        a.calcularPrecoVenda();
        a.imprimirValorDetalhado();
        a.imprimirPecaNacional();
                
    }
}
