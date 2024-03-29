
package com.mycompany.atividade04;

public class Peca extends Produto { // subclasse peça é extensão da superclasse produto (herança)
    private String fabricantePeca;
    private double taxaImpostoEstadual;
    
    public Peca(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal, String fabricantePeca, double taxaImpostoEstadual) {
        super(codigo, nome, precoCusto, margemLucro, precoVenda, marcaVeiculo, modeloVeiculo, anoInicial, anoFinal); // atributos da super classe produto
        this.setFabricantePeca(fabricantePeca);
        this.setTaxaImpostoEstadual(taxaImpostoEstadual);
    }
    
    //Método especiais
    public String getFabricantePeca() {
        return fabricantePeca;
    }

    public void setFabricantePeca(String fabricantePeca) {
        this.fabricantePeca = fabricantePeca;
    }

    public double getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(double taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    //Método da própria classe
    public void imprimirPecaNacional() {
        System.out.println("----- PEÇA NACIONAL -----");
        System.out.println("Código da peça: " + getCodigo());
        System.out.println("Nome da peça: " + getNome());
        System.out.println("Preço de  custo: R$" + getPrecoCusto());
        System.out.println("Margem de lucro: " + getMargemLucro() + "%");
        System.out.println("Preço de venda: R$" + getPrecoVenda());
        System.out.println("Marca do veículo: " + getMarcaVeiculo());
        System.out.println("Modelo do veículo: " + getModeloVeiculo());
        System.out.println("Ano inicial de produção: " + getAnoInicial());
        System.out.println("Ano final de produção: " + getAnoFinal());
        System.out.println("Fabricante da peça: " + this.getFabricantePeca());
        System.out.println("Taxa de imposto estadual: R$" + this.getTaxaImpostoEstadual());
        
        System.out.println();
    }
    
    //Métodos abstratos implementados
    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda(getPrecoVenda() + this.getTaxaImpostoEstadual() + (getPrecoCusto() * (20.00 / 100.00))); //Para as peças nacionais compradas em outro estado, adicione ao preço de venda a taxa de imposto de 20% sobre o preço de custo.
    }
    
    @Override
    public void imprimirValorDetalhado() {
        System.out.println("Valor de venda da peça nacional: R$" + getPrecoVenda());
        
        System.out.println();
    }
}
