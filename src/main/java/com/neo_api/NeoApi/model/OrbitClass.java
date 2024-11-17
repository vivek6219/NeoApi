package com.neo_api.NeoApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrbitClass {
    @JsonProperty("orbit_class_type")
    private String orbitClassType;

    @JsonProperty("orbit_class_description")
    private String orbitClassDesc;

    @JsonProperty("orbit_class_range")
    private String orbitClassRange;

    public String getOrbitClassType() {
        return orbitClassType;
    }

    public void setOrbitClassType(String orbitClassType) {
        this.orbitClassType = orbitClassType;
    }

    public String getOrbitClassDesc() {
        return orbitClassDesc;
    }

    public void setOrbitClassDesc(String orbitClassDesc) {
        this.orbitClassDesc = orbitClassDesc;
    }

    public String getOrbitClassRange() {
        return orbitClassRange;
    }

    public void setOrbitClassRange(String orbitClassRange) {
        this.orbitClassRange = orbitClassRange;
    }

    @Override
    public String toString() {
        return "OrbitClass{" +
                "orbitClassType='" + orbitClassType + '\'' +
                ", orbitClassDesc='" + orbitClassDesc + '\'' +
                ", orbitClassRange='" + orbitClassRange + '\'' +
                '}';
    }
}
