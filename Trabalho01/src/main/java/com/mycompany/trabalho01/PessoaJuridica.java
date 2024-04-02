package com.mycompany.trabalho01;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private double faturamentoMensal;
    private int faixa;
    private int numeroFuncionarios;

public PessoaJuridica(String nome, String endereco, String telefone, int codigo, String cnpj, String inscricaoEstadual, double faturamentoMensal, int numeroFuncionarios) {
        super(nome, endereco, telefone, codigo);
        this.setCnpj(cnpj);
        this.setInscricaoEstadual(inscricaoEstadual);
        this.setFaturamentoMensal(faturamentoMensal);
        this.setFaixa(this.definirFaixa(this.getFaturamentoMensal() * 12.00));
        this.setNumeroFuncionarios(numeroFuncionarios);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public double getFaturamentoMensal() {
        return this.faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public int getFaixa() {
        return this.faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public int getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public void imprimirDados() {
        System.out.println("----- DADOS DE PESSOA JURÍDICA -----");
        System.out.println("Código: " + super.getCodigo());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Inscrição estadual: " + this.getInscricaoEstadual());
        System.out.println("Faturamento mensal: " + this.getFaturamentoMensal());
        System.out.println("Faixa: " + this.getFaixa() + "ª");
        System.out.println("Número de funcionários: " + this.getNumeroFuncionarios());
        System.out.println();
    }
    
    private double calcularFaturamentoAnual() {
        System.out.println("----- REALIZADO O CÁLCULO DE FATURAMENTO ANUAL DE PESSOA JURÍDICA -----");
        return this.getFaturamentoMensal() * 12.00;
    }
    
    private int definirFaixa(double faturamentoAnual) {
        System.out.println("----- DEFINIDO A FAIXA DE PESSOA JURÍDICA -----");
        if(faturamentoAnual <= 180000.00) {
            return this.getFaixa() + 1;
        } else if(faturamentoAnual <= 360000.00) {
            return this.getFaixa() + 2;
        } else if(faturamentoAnual <= 720000.00) {
            return this.getFaixa() + 3;
        } else if(faturamentoAnual <= 1800000.00) {
            return this.getFaixa() + 4;
        } else if(faturamentoMensal <= 3600000.00) {
            return this.getFaixa() + 5;
        } else if(faturamentoMensal <= 4800000.00) {
            return this.getFaixa() + 6;
        } else {
            System.out.println("Valor de faturamento anual excedido.\n");
        }
        return 0;
    }
    
    public void imprimirFaturamentoAnual() {
        System.out.println("---- IMPRESSÃO DO FATURAMENTO ANUAL DE PESSOA JURÍDICA -----");
        System.out.println("Faturamento anual: R$" + this.calcularFaturamentoAnual());
        System.out.println();
    }
    
    public void alterarFaturamento(double valor) {
        System.out.println("----- ALTERADO O FATURAMENTO DE PESSOA JURÍDICA (acrescentado / subtraído) -----");
        this.setFaturamentoMensal(this.getFaturamentoMensal() + valor);
        this.setFaixa(this.definirFaixa(this.getFaturamentoMensal() * 12.00)); // necessário para imprimir a faixa atualizada após alteração faturamento mensal
    }
    
    public void gerarGuiaPagamento() {
        System.out.println("----- IMPRESSÃO DO IMPOSTO A SER PAGO POR PESSOA JURÍDICA -----");
        double faturamentoAnual = this.calcularFaturamentoAnual();
        if(faturamentoAnual <= 180000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.040));
        } else if(faturamentoAnual <= 360000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.075 - 5940.00));
        } else if(faturamentoAnual <= 720000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.095 - 13860.00));
        } else if(faturamentoAnual <= 1800000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.1070 -  22500.00));
        } else if(faturamentoMensal <= 3600000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.1430 -  87300.00));
        } else if(faturamentoMensal <= 4800000.00) {
            System.out.println("Valor tributado: R$" + (faturamentoAnual * 0.19 -  378000.00));
        } else {
            System.out.println("Valor de faturamento anual excedido.");
        }
        System.out.println();
    }
}
