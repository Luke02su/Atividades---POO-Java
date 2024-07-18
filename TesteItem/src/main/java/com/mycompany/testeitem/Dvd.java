package com.mycompany.testeitem;

public class Dvd extends Item {
    private int duracaoMinutos;

    public Dvd() {
        
    }

    public Dvd(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
 
    @Override
    public void inserirDados () {
        System.out.println("--- INSERÇÃO DE DADOS DE DVD ---");
        super.inserirDados();
        System.out.print("Duração de minutos: ");
        this.setDuracaoMinutos(scan.nextInt());
    }
    
    public void atualizarPreco () {
        super.setPreco(super.getPreco() + (super.getPreco() * (10 / 100.00)));
    }
    
    public void atualizarPreco (int porcentagem) {
        if (porcentagem > 0 && porcentagem <= 40) {
            super.setPreco(super.getPreco() + (super.getPreco() * ((double)(porcentagem / 100.00))));
        } else if (porcentagem < 0) {
            System.out.println("ERRO: porcentagem menor que 0.");
        } else {
            System.out.println("ERRO: porcentagem maior que 40.");
        }
    }
}
