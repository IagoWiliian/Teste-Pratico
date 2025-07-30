package com.example.testedti.model;

public class Petshop {
    private String nome;
    private double distancia;
    private double precoPequeno;
    private double precoGrande;
    private double precoTotal;

    public Petshop(String nome, double distancia, double precoPequeno, double precoGrande) {
        this.nome = nome;
        this.distancia = distancia;
        this.precoPequeno = precoPequeno;
        this.precoGrande = precoGrande;
    }

    public String getNome() { return nome; }
    public double getDistancia() { return distancia; }
    public double getPrecoPequeno() { return precoPequeno; }
    public double getPrecoGrande() { return precoGrande; }
    public double getPrecoTotal() { return precoTotal; }
    public void setPrecoTotal(double precoTotal) { this.precoTotal = precoTotal; }
}