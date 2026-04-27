package com.example.MeuprojetoDS.model;
// configurações da parede
public class Parede {
    private String nomeComodo; //exemplo: cite cozinha, sala, banheiro
    private double largura; //Espessura da parede
    private double comprimento;
    private double altura;

    private boolean temJanela;
    private double alturaJanela;
    private double comprimentoJanela;

    private boolean temPorta;
    private double alturaPorta;
    private double comprimentoPorta;

    //indicar os encontros
    private String verticeOrigem;
    private String verticeDestino;

    //getters e setters
    public String getNomeComodo() {
        return nomeComodo;
    }

    public void setNomeComodo(String nomeComodo) {
        this.nomeComodo = nomeComodo;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isTemJanela() {
        return temJanela;
    }

    public void setTemJanela(boolean temJanela) {
        this.temJanela = temJanela;
    }

    public double getAlturaJanela() {
        return alturaJanela;
    }

    public void setAlturaJanela(double alturaJanela) {
        this.alturaJanela = alturaJanela;
    }

    public double getComprimentoJanela() {
        return comprimentoJanela;
    }

    public void setComprimentoJanela(double comprimentoJanela) {
        this.comprimentoJanela = comprimentoJanela;
    }

    public boolean isTemPorta() {
        return temPorta;
    }

    public void setTemPorta(boolean temPorta) {
        this.temPorta = temPorta;
    }

    public double getAlturaPorta() {
        return alturaPorta;
    }

    public void setAlturaPorta(double alturaPorta) {
        this.alturaPorta = alturaPorta;
    }

    public double getComprimentoPorta() {
        return comprimentoPorta;
    }

    public void setComprimentoPorta(double comprimentoPorta) {
        this.comprimentoPorta = comprimentoPorta;
    }

    public String getVerticeOrigem() {
        return verticeOrigem;
    }

    public void setVerticeOrigem(String verticeOrigem) {
        this.verticeOrigem = verticeOrigem;
    }

    public String getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(String verticeDestino) {
        this.verticeDestino = verticeDestino;
    }
}
