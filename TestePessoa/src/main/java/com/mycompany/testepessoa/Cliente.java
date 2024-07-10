package com.mycompany.testepessoa;

public class Cliente extends Pessoa {
    private int limiteEmprestimo;
    private int itensComOCliente;

    public Cliente(int codigo, String nome, String cpf, char sexo, String telefone, int limiteEmprestimo, int itensComOCliente) {
        super(codigo, nome, cpf, sexo, telefone);
        this.limiteEmprestimo = limiteEmprestimo;
        this.itensComOCliente = itensComOCliente;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public int getItensComOCliente() {
        return itensComOCliente;
    }

    public void setItensComOCliente(int itensComOCliente) {
        this.itensComOCliente = itensComOCliente;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de empréstimo: " + this.getLimiteEmprestimo());
        System.out.println("Itens com o cliente: " + this.getItensComOCliente());
        System.out.println();
    }
    
    public void emprestarItem(int qtdItem) {
        if (qtdItem <= this.getLimiteEmprestimo() && qtdItem > 0 && this.getItensComOCliente() < this.getLimiteEmprestimo()) {
            this.setItensComOCliente((this.getItensComOCliente() + qtdItem));
            this.setLimiteEmprestimo(this.getLimiteEmprestimo() - this.getItensComOCliente());
        } else if (qtdItem < 0) {
            System.out.println("Ocorreu um erro: Valor de itens a serem adicionados ao empréstimo é negativo.");
        } else {
            System.out.println("Ocorreu um erro: Quantidade de itens a serem emprestados acima do limite de empréstimo.");
        }
        System.out.println();
    }
    
    public void devolverItem(int qtdItem) {
        if (qtdItem > 0 && qtdItem <= this.getItensComOCliente()) {
            this.setItensComOCliente((this.getItensComOCliente() - qtdItem));
            this.setLimiteEmprestimo(this.getLimiteEmprestimo() + this.getItensComOCliente());
        } else {
            System.out.println("Ocorreu um erro: Valor de itens a serem devolvidos do empréstimo é negativo.");
        }
        System.out.println();
    }
}
