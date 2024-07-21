package com.mycompany.lsd.minhaempresa;

public class Servico {
    
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorMaoDeObra;
    private double valorDasPecas;
    public static double valorComissao;
    public static double valorMaoDeObraPadrao;
    
    public Servico(Cliente cliente, Funcionario funcionario) {
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    
    public Servico(Cliente cliente, Funcionario funcionario, double valorDasPecas) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorDasPecas = valorDasPecas;
        this.valorMaoDeObra = this.valorMaoDeObraPadrao;
    }
    
    public Servico(Cliente cliente, Funcionario funcionario, double valorDasPecas, double valorMaoDeObra) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorDasPecas = valorDasPecas;
        if (valorMaoDeObra < 50.00) {
            this.valorMaoDeObra = valorMaoDeObraPadrao;
        } else {
            this.valorMaoDeObra = valorMaoDeObra;
        }
    }  
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorMaoDeObra() {
        return valorMaoDeObra;
    }

    public void setValorMaoDeObra(double valorMaoDeObra) {
        this.valorMaoDeObra = valorMaoDeObraPadrao;
    }

    public double getValorDasPecas() {
        return valorDasPecas;
    }

    public void setValorDasPecas(double valorDasPecas) {
        this.valorDasPecas = valorDasPecas;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public double getValorMaoDeObraPadrao() {
        return valorMaoDeObraPadrao;
    }

    public void setValorMaoDeObraPadrao(double valorMaoDeObraPadrao) {
        this.valorMaoDeObraPadrao = valorMaoDeObraPadrao;
    }
    
    public void imprimir() {
        System.out.println("\n--- INÍCIO DA LISTAGEM DE DADOS DE SERVIÇO ---");
        this.cliente.imprimir();
        this.funcionario.imprimir();
        this.setValorMaoDeObra(this.getValorMaoDeObra() + this.getValorDasPecas() + this.getValorComissao());
        this.calculoComissaoFuncionario();
        System.out.println("\nValor total do serviço: R$" + this.getValorDasPecas() + this.getValorMaoDeObra() + this.getValorComissao());
        System.out.println("\n--- FIM DA LISTAGEM DE DADOS DE SERVIÇO ---");
    }
    
    private void calculoComissaoFuncionario() {
        System.out.println("\n--- CÁLCULO DE COMISSÃO DO FUNCIONÁRIO PELO SERVIÇO ---");
        this.setValorComissao(this.getValorDasPecas() * this.getValorComissao());
        this.funcionario.setComissao(this.funcionario.getComissao() + this.getValorComissao());
    }
}
