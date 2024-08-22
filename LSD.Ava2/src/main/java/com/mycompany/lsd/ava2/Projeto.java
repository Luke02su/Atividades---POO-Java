package com.mycompany.lsd.ava2;

public class Projeto {
    private int codigo;
    private String titulo;
    private Professor coodenador;
    private int numerocolaboradores;
    private double verbaDisponivel;

    public Projeto(int codigo, String titulo, Professor coodenador, int numerocolaboradores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.coodenador = coodenador;
        this.numerocolaboradores = numerocolaboradores;
        this.calcular();
    } 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getCoodenador() {
        return coodenador;
    }

    public void setCoodenador(Professor coodenador) {
        this.coodenador = coodenador;
    }

    public int getNumerocolaboradores() {
        return numerocolaboradores;
    }

    public void setNumerocolaboradores(int numerocolaboradores) {
        this.numerocolaboradores = numerocolaboradores;
    }

    public double getVerbaDisponivel() {
        return verbaDisponivel;
    }

    public void setVerbaDisponivel(double verbaDisponivel) {
        this.verbaDisponivel = verbaDisponivel;
    }
    
    public void imprimir() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Coordenador: " + this.coodenador.getNome());
        System.out.println("Número de colaboradores: " + this.getNumerocolaboradores());
        System.out.println("Verba disponível: " + this.getVerbaDisponivel());
    }
    
    private void calcular() {
        this.setVerbaDisponivel((350.00 * this.getNumerocolaboradores()) + 1200.00);
    }
    
}
