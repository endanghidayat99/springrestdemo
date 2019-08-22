package com.endang.restfulldemo.models;

public class Komputasi {
    private Integer bilanganA;
    private Integer bilanganB;
    private Integer hasil;

    public Komputasi() {
    }

    public Komputasi(Integer bilanganA, Integer bilanganB) {
        this.bilanganA = bilanganA;
        this.bilanganB = bilanganB;
    }

    public Komputasi(Integer bilanganA, Integer bilanganB, Integer hasil) {
        this.bilanganA = bilanganA;
        this.bilanganB = bilanganB;
        this.hasil = hasil;
    }

    public Integer getBilanganA() {
        return bilanganA;
    }

    public void setBilanganA(Integer bilanganA) {
        this.bilanganA = bilanganA;
    }

    public Integer getBilanganB() {
        return bilanganB;
    }

    public void setBilanganB(Integer bilanganB) {
        this.bilanganB = bilanganB;
    }

    public Integer getHasil() {
        return hasil;
    }

    public void setHasil(Integer hasil) {
        this.hasil = hasil;
    }
}
