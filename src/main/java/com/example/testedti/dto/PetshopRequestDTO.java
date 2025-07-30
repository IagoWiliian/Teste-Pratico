package com.example.testedti.dto;

public class PetshopRequestDTO {
    private String data;
    private int caesPequenos;
    private int caesGrandes;

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getCaesPequenos() { return caesPequenos; }
    public void setCaesPequenos(int caesPequenos) { this.caesPequenos = caesPequenos; }

    public int getCaesGrandes() { return caesGrandes; }
    public void setCaesGrandes(int caesGrandes) { this.caesGrandes = caesGrandes; }
}