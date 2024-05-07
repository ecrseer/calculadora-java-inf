package br.gabtp1.gab2demo.controller;

public class SubtraiDto {
    String minuendo;
    String subtraendo;

    public SubtraiDto(String minuendo, String subtraendo) {
        this.minuendo = minuendo;
        this.subtraendo = subtraendo;
    }

    public String getMinuendo() {
        return minuendo;
    }

    public void setMinuendo(String minuendo) {
        this.minuendo = minuendo;
    }

    public String getSubtraendo() {
        return subtraendo;
    }

    public void setSubtraendo(String subtraendo) {
        this.subtraendo = subtraendo;
    }
}
