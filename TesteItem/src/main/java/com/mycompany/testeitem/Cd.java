package com.mycompany.testeitem;

public class Cd extends Item {
    private int numFaixas;

    public Cd() {
        
    }

    public Cd(int codigo, String nome, double preco, int numFaixas) {
        super(codigo, nome, preco);
        this.numFaixas = numFaixas;
    }
    
    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public void inserirDados() {
        System.out.println("--- INSERÇÃO DE DADOS DE CD ---");
        super.inserirDados();
        System.out.print("Número de faixas: ");
        this.setNumFaixas(scan.nextInt());
    }
}
