package com.neo_api.NeoApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelativeVelocity {
    @JsonProperty("kilometers_per_second")
    private String kmps;
    @JsonProperty("kilometers_per_hours")
    private String kmph;
    @JsonProperty("miles_per_hour")
    private String mph;

    public String getKmps() {
        return kmps;
    }

    public void setKmps(String kmps) {
        this.kmps = kmps;
    }

    public String getKmph() {
        return kmph;
    }

    public void setKmph(String kmph) {
        this.kmph = kmph;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    @Override
    public String toString() {
        return "RelativeVelocity{" +
                "kmps='" + kmps + '\'' +
                ", kmph='" + kmph + '\'' +
                ", mph='" + mph + '\'' +
                '}';
    }
}
