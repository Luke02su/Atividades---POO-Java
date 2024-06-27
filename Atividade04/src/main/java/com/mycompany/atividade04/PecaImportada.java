package com.mycompany.atividade04;

public class PecaImportada extends Produto { // subclasse peça é extensão da superclasse produto
    private String revendedor;
    private double valorFrete;
    private double valorDolar;
    private double valorImportacao;
    
    public PecaImportada(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal, String revendedor, double valorFrete, double valorDolar, double valorImportacao) {
        super(codigo, nome, precoCusto, margemLucro, precoVenda, marcaVeiculo, modeloVeiculo, anoInicial, anoFinal); // atributos da super classe produto
        this.setRevendedor(revendedor);
        this.setValorFrete(valorFrete);
        this.setValorDolar(valorDolar);
        this.setValorImportacao(valorImportacao);
    }
    
    //Método especiais
    public String getRevendedor() {
        return this.revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorDolar() {
        return this.valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorImportacao() {
        return this.valorImportacao;
    }

    public void setValorImportacao(double valorImportacao) {
        this.valorImportacao = valorImportacao;
    }  
    
    //Métodos da própria classe
    public void imprimirPecaImportada() {
        System.out.println("----- PECA IMPORTADA -----"); // poderia reaproveitar a impressão de prodruto usando super.imprimir(), sem ter a necessidade de duplicar os comandos
        System.out.println("Código da peça: " + super.getCodigo());
        System.out.println("Nome da peça: " + super.getNome());
        System.out.println("Preço de  custo: R$" + super.getPrecoCusto());
        System.out.println("Margem de lucro: " + super.getMargemLucro() + "%");
        System.out.println("Preço de venda: R$" + super.getPrecoVenda());
        System.out.println("Marca do veículo: " + super.getMarcaVeiculo());
        System.out.println("Modelo do veículo: " + super.getModeloVeiculo());
        System.out.println("Ano inicial de produção: " + super.getAnoInicial());
        System.out.println("Ano final de produção: " + super.getAnoFinal());
        System.out.println("Revendedor: " + this.getRevendedor());
        System.out.println("Valor do frete: " + this.getValorFrete());
        System.out.println("Valor do dólar: R$" + this.getValorDolar());
        System.out.println("Valor importação: R$" + this.getValorImportacao());
        
        System.out.println();
    }
    
    private double calcularValorImportacao() {
        if((super.getPrecoCusto() / this.getValorDolar()) > 50.00) {
            return this.getValorImportacao() + super.getPrecoCusto() + (super.getPrecoCusto() * (62.00 / 100.00)); // Considere que todo produto acima de 50 dólares é taxado em 62% sobre seu valor de custo. Utilize a contação do dólar atual para realização do cálculo
        } else {
            return this.getValorImportacao();
        }
    }
    
    public void imprimirValorImportacao() {
        System.out.println("Valor de importação: R$" + calcularValorImportacao());
        
        System.out.println();
    }
    
    //Métodos abstratos implementados
    @Override
    public void calcularPrecoVenda() {
        super.setPrecoVenda(super.getPrecoCusto() + (super.getPrecoVenda() * (super.getMargemLucro() / 100.00))); //O preço de venda é o preço de custo + % margem de lucro.
        super.setPrecoVenda(super.getPrecoVenda() + this.getValorFrete() + calcularValorImportacao());  //Para peças importadas, junto ao preço de venda deve ser adicionado o valor do frete + valor importação
    }
    
    @Override
    public void imprimirValorDetalhado() {
        System.out.println("Valor de venda da peça importada: R$" + super.getPrecoVenda()); 
        
        System.out.println();
    }
}
