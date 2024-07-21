package com.mycompany.lsd.minhaempresa;

public class Funcionario extends Pessoa {
    
    private int numeroRegistro;
    private double salario;
    private double comissao;
    private static int numeroTotalFuncionarios;
    
    public Funcionario() {
        
    }

    public Funcionario(String nome, int numeroCPF, int numeroRegistro, double salario, double comissao) {
        super(nome, numeroCPF);
        this.numeroRegistro = numeroRegistro;
        this.salario = salario;
        this.comissao = comissao;
        this.numeroTotalFuncionarios++;
        super.setPertenceObjeto(false);
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public int getNumeroTotalFuncionarios() {
        return numeroTotalFuncionarios;
    }

    private void setNumeroTotalFuncionarios(int aNumeroTotalFuncionarios) {
        numeroTotalFuncionarios = aNumeroTotalFuncionarios;
    }
    
    @Override
    public void imprimir() {
        System.out.println("\n--- DADOS DE FUNCIONÁRIOS --- ");
        super.imprimir();
        System.out.println("Número de registro: " + this.getNumeroRegistro());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Comissão: " + this.getComissao());
        System.out.println("Número total de funcionários: " + this.getNumeroTotalFuncionarios());
    }
    
    public void aumentarSalario() {
        System.out.println("\n--- SALÁRIO DE FUNCIONÁRIO AUMENTADO VIA PREDEFINIÇÃO ---");
        this.setSalario(this.getSalario() * 1.10);
        this.imprimirFuncionario("Aumento em 10%.");
    }
    
    public void aumentarSalario(int porcentagem) {
        System.out.println("\n--- SALÁRIO DE FUNCIONÁRIO AUMENTADO VIA PARÂMETRO---");
        if (porcentagem <= 50) {
            this.setSalario(this.getSalario() + (this.getSalario() * ((double)porcentagem / 100.00)));
            this.imprimirFuncionario("Aumento em " + porcentagem + "%.");
        } else {
            System.out.println("ERRO: Salário não pode ser aumentado em mais de 50% em uma vez.");
        }
    }
    
    private void imprimirFuncionario(String mensagem) {
        System.out.println("\n--- DADOS DE FUNCIONÁRIOS ATUALIZADOS ---");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Número de registro: " + this.getNumeroRegistro());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Mensagem: " + mensagem);
    }
    
    public void imprimirSalarioComissao() {
        System.out.println("\n--- SOMA DA COMISSÃO AO SALÁRIO NO FINAL DO MÊS ---");
        this.setSalario(this.getSalario() + this.getComissao());
        System.out.println("Nome do funcionário: " + super.getNome());
        System.out.println("Valor em R$" + this.getSalario());
    }
  
}
