package com.mycompany.pooaula08;
//venda e itens venda composição (venda excluído deveria excluir ItensVenda), vamos usar aqui composição

import java.util.ArrayList; // uma classe
import java.util.List; // classe de interface de itens

public class Venda {
    private Cliente cliente; // agregação
    private List<ItensVenda> itens = new ArrayList<>(); // lista de itens (gerenciada pelo ArrayList, dinâmica, lista encadeada) // lista não entra no construtor
    private double totalVenda;
 

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.totalVenda = 0; // sem necessidade de parâmetro, começa como zero total da venda
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensVenda> getItens() {
        return itens;
    }

    /*public void setItens(List<ItensVenda> itens) {
        this.itens = itens;
    }*/

    public double getTotalVenda() {
        return totalVenda;
    }

    /*public void setTotalVenda(double totalVenda) { //setTotalVenda é desnecessário setar fora da classe
        this.totalVenda = totalVenda;
    }*/
    
    public void addItemLista(ItensVenda x) { // adiciona um item a lista
        this.itens.add(x);
    }
    
    public void insereItem(Produto p, int qtd) {
        ItensVenda item = new ItensVenda(p, qtd, p.getPreco()); // preço do produto na classe produto// gera itensVenda
        this.itens.add(item); // composição
    }
    
    public void imprimirVenda() {
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("ID\tProduto\t\tQtd\tValor\tTotal");
        for(int i = 0; i < this.itens.size(); i++) {
            System.out.print("#" + (i+1) + "\t" + this.itens.get(i).getProduto().getNome());
            System.out.print("\t" + this.itens.get(i).getQuantidade());
            System.out.print("\t" + this.itens.get(i).getPreco());
            double total = (double)this.itens.get(i).getPreco() * this.itens.get(i).getQuantidade(); // primeiro qquantidade vira double para realizar calculo, pois é int
            System.out.println("\t" + total);
            this.totalVenda += total;
        }
        System.out.println("Total da venda: " + this.totalVenda);
    }
    
}
