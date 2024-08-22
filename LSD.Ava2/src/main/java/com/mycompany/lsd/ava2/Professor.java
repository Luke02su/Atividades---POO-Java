package com.mycompany.lsd.ava2;

public class Professor extends Pessoa {
    
    private int numeroRegistro;
    private double salario;
    public static int numTotalProfessor = 0;

    public Professor(int codigo, String nome, int cpf, char sexo, int numeroRegistro, double salario) {
        super(codigo, nome, cpf, sexo);
        this.numeroRegistro = numeroRegistro;
        this.salario = salario;
        this.numTotalProfessor++;
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
    
    public static int getNumTotalProfessor() {
        return numTotalProfessor;
    }
    
    @Override
    public void imprimir () {
        super.imprimir();
        System.out.println("Número de registro: " + this.getNumeroRegistro());
        System.out.println("Salário: " + this.getSalario());
    }
    
    public void aumentarSalario() {
        this.setSalario(this.getSalario() + (this.getSalario() * 0.05));
        double aumentoSalarial = this.getSalario() * 0.05;
        imprimirProfessor(aumentoSalarial);
    }
    
    public void aumentarSalario(int porcentagem) {
        if (porcentagem > 0 && porcentagem <= 30) {
            this.setSalario(this.getSalario() + (this.getSalario() * (double)(porcentagem / 100.00)));
            double aumentoSalarial = this.getSalario() * (double)(porcentagem / 100.00);
            imprimirProfessor(aumentoSalarial);
        } else {
            System.out.println("Porcentagem negativa ou porcentagem maior que 30%.");
        }
    }
    
    private void imprimirProfessor (double mensagem) {
        System.out.println("Número de registro: " + this.getNumeroRegistro());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Aumento salarial de R$: " + mensagem);
    }
}
