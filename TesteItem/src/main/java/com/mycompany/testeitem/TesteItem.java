package com.mycompany.testeitem;

public class TesteItem {
    public static void main(String[] args){
        Cd cd1 = new Cd ();
        
        cd1.inserirDados();
        System.out.println("\n--- IMPRESÃO DE DADOS DE CD1 ---");
        System.out.println("Código: " + cd1.getCodigo());
        System.out.println("Nome: " + cd1.getNome());
        System.out.println("Preço: " + cd1.getPreco());
        System.out.println("Número de faixas: " + cd1.getNumFaixas());
        System.out.println();
        
        Dvd dvd1 = new Dvd ();
        
        dvd1.inserirDados();
        System.out.println("\n--- IMPRESÃO DE DADOS DE DVD1 ---");
        System.out.println("Código: " + dvd1.getCodigo());
        System.out.println("Nome: " + dvd1.getNome());
        System.out.println("Preço: " + dvd1.getPreco());
        System.out.println("Duração em minutos: " + dvd1.getDuracaoMinutos());
        dvd1.atualizarPreco();
        System.out.println("Preço atualizado de DVD1: " + dvd1.getPreco());
        System.out.println();
        
        Dvd dvd2 = new Dvd ();
        
        dvd2.inserirDados();
        System.out.println("\n--- IMPRESÃO DE DADOS DE DVD2 ---");
        System.out.println("Código: " + dvd2.getCodigo());
        System.out.println("Nome: " + dvd2.getNome());
        System.out.println("Preço: " + dvd2.getPreco());
        System.out.println("Duração em minutios: " + dvd2.getDuracaoMinutos());
        dvd2.atualizarPreco(17);
        System.out.println("Preço atualizado de DVD2: " + dvd2.getPreco());
    }
}