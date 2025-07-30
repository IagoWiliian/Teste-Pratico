package com.example.testedti.dto;

public class PetshopResponseDTO {
    private String nome;
    private double precoTotal;

    public PetshopResponseDTO(String nome, double precoTotal) {
        this.nome = nome;
        this.precoTotal = precoTotal;
    }

    public String getNome() { return nome; }
    public double getPrecoTotal() { return precoTotal; }
}