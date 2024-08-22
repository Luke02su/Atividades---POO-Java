package com.mycompany.lsd.ava2;

public final class Pesquisa {
    private int código;
    private String tema;
    private Pesquisador pesquisador;
    private int numeroMesesDuracaoPesquisa;

    public Pesquisa(int código, String tema, int numeroMesesDuracaoPesquisa, double bolsa, String areaAtuacao, int codigo, String nome, int cpf, char sexo) {
        this.código = código;
        this.tema = tema;
        this.numeroMesesDuracaoPesquisa = numeroMesesDuracaoPesquisa;
        this.pesquisador = new Pesquisador(bolsa, areaAtuacao, codigo, nome, cpf, sexo);
        this.calcularBolsa(this.getNumeroMesesDuracaoPesquisa());
    }
  
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    public int getNumeroMesesDuracaoPesquisa() {
        return numeroMesesDuracaoPesquisa;
    }

    public void setNumeroMesesDuracaoPesquisa(int numeroMesesDuracaoPesquisa) {
        this.numeroMesesDuracaoPesquisa = numeroMesesDuracaoPesquisa;
    }
    
    public void imprimir() {
        System.out.println("Código: " + this.getCódigo());
        System.out.println("Tema: " + this.getTema());
        System.out.println("Pesquisador: " + this.pesquisador.getNome());
        System.out.println("Número de meses de duração da pesquisa: " + this.getNumeroMesesDuracaoPesquisa());
    }
    
    private void calcularBolsa (int meses) {
        if (meses <= 6 && pesquisador.getBolsa() <= 1800.00) {
            double valorBolsa = ((this.getNumeroMesesDuracaoPesquisa() * pesquisador.getBolsa()) - (1800.00 * 0.04));
        } else if (meses >= 6 && meses <= 12) {
            double valorBolsa = (((this.getNumeroMesesDuracaoPesquisa() * pesquisador.getBolsa()) - (1800.00 * 0.073)) - 59.40);
        } else if (meses >= 12 && meses <= 24)  {
            double valorBolsa = (((this.getNumeroMesesDuracaoPesquisa() * pesquisador.getBolsa()) - (1800.00 * 0.095)) - 138.60);
        }       
    }
}
