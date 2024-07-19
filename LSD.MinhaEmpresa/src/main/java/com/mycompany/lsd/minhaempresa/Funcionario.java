package com.mycompany.lsd.minhaempresa;

public class Funcionario extends Pessoa {
    
    private int numeroRegistro;
    private double salario;
    private double comissao;
    private static int numeroTotalFuncionarios;
    
    public Funcionario() {
        
    }

    public Funcionario( String nome, int numeroCPF, int numeroRegistro, double salario, double comissao) {
        super(nome, numeroCPF);
        this.numeroRegistro = numeroRegistro;
        this.salario = salario;
        this.comissao = comissao;
        this.numeroTotalFuncionarios++;
        super.setPertenceObjeto(false);
    }
 
    public static int getNumeroTotalFuncionarios() {
        return numeroTotalFuncionarios;
    }

    public static void setNumeroTotalFuncionarios(int aNumeroTotalFuncionarios) {
        numeroTotalFuncionarios = aNumeroTotalFuncionarios;
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
        System.out.println("--\n --- SALÁRIO DE FUNCIONÁRIO AUMENTADO EM 10% ---");
        this.setSalario(this.getSalario() * 1.10);
    }
    
    public void aumentarSalario(int porcentagem) {
        System.out.println("\n --- SALÁRIO DE FUNCIONÁRIO AUMENTADO VIA PARÂMETRO EM ---" + porcentagem);
        this.setSalario(this.getSalario() + (this.getSalario() * ((double)porcentagem / 100.00)));
    }
  
}
