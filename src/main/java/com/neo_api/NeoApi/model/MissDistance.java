package com.neo_api.NeoApi.model;

public class MissDistance {
    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;

    public String getAstronomical() {
        return astronomical;
    }

    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "MissDistance{" +
                "astronomical='" + astronomical + '\'' +
                ", lunar='" + lunar + '\'' +
                ", kilometers='" + kilometers + '\'' +
                ", miles='" + miles + '\'' +
                '}';
    }
}
