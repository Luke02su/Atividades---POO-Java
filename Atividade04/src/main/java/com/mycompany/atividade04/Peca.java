package com.mycompany.atividade04;

public class Peca extends Produto {
    private String fabricantePeca;
    private double taxaImpostoEstadual;
    
    public Peca(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal, String fabricantePeca, double taxaImpostoEstadual) {
        super(codigo, nome, precoCusto, margemLucro, precoVenda, marcaVeiculo, modeloVeiculo, anoInicial, anoFinal);
        this.setFabricantePeca(fabricantePeca);
        this.setTaxaImpostoEstadual(20);
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
    
    //Métodos da própria classe
    public void imprimirPecaNacional() {
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
    }
    
    //Métodos abstratos implementados
    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda(getPrecoVenda() + (getPrecoCusto() * (this.getTaxaImpostoEstadual() / 100))); //Para as peças nacionais compradas em outro estado, adicione ao preço de venda a taxa de imposto de 20% sobre o preço de custo.
    }
    
    @Override
    public void imprimirValorDetalhado() {
        System.out.println("Valor de venda da peça nacional: " + getPrecoVenda());
    }
}
