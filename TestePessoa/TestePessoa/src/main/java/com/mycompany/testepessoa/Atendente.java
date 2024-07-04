package com.mycompany.testepessoa;

public class Atendente extends Pessoa {
    private double salario;
    private String usuario;
    private String senha;

    public Atendente(int codigo, String nome, String cpf, char sexo, String telefone, double salario, String usuario, String senha) {
        super(codigo, nome, cpf, sexo, telefone);
        this.salario = salario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Usuário: " + this.getUsuario());
        System.out.println("Senha: " + this.getSenha());
        System.out.println();
    }
    
    public void aumentarSalario(double porcentagem) {
        if (porcentagem <= 25 && porcentagem > 0){
            this.setSalario(this.getSalario() + (this.getSalario() * (porcentagem / 100)));
        } else if (porcentagem > 25){
            System.out.println("Ocorreu um erro: Aumento salarial maior que 25%.");
        } else {
            System.out.println("Ocorreu um erro: Aumento salarial negativo ou nulo.");
        }
        System.out.println();
    }
}
