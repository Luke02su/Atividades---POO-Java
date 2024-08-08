package com.mycompany.testecontrole;

public class Computador extends Equipamento {
    
    private int pk_computador;
    private String processador;
    private String memoria;
    private String windows;
    private String armazenamento;
    private char formatacao;
    private char manutencao;
    
    public Computador() {
        
    }

    public Computador(int pk_computador, String processador, String memoria, String windows, String armazenamento, char formatacao, char manutencao, int pk_equipamento, String modelo) {
        super(pk_equipamento, modelo);
        this.pk_computador = pk_computador;
        this.processador = processador;
        this.memoria = memoria;
        this.windows = windows;
        this.armazenamento = armazenamento;
        this.formatacao = formatacao;
        this.manutencao = manutencao;
    }

    public int getPk_computador() {
        return pk_computador;
    }

    public void setPk_computador(int pk_computador) {
        this.pk_computador = pk_computador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public char getFormatacao() {
        return formatacao;
    }

    public void setFormatacao(char formatacao) {
        this.formatacao = formatacao;
    }
    
    public char getManutencao() {
        return manutencao;
    }

    public void setManutencao(char manutencao) {
        this.manutencao = manutencao;
    }  

    void setFk_computador(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
