package com.neo_api.NeoApi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NearEarthObject {
    private String link;
    private String id;
    @JsonProperty("neo_reference_id")
    private String neo_ref_id;
    private String name;
    private String name_limited;
    private String designation;
    private String nasa_jpl_url;
    private String absolute_magnitude_h;
    private String estimated_diameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    private String hazardous;
    @JsonProperty("close_approach_data")
    private List<ApproachData> approachData;
    @JsonProperty("orbital_data")
    private OrbitalData orbitalData;
    @JsonProperty("is_sentry_object")
    private String isSentryObject;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeo_ref_id() {
        return neo_ref_id;
    }

    public void setNeo_ref_id(String neo_ref_id) {
        this.neo_ref_id = neo_ref_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_limited() {
        return name_limited;
    }

    public void setName_limited(String name_limited) {
        this.name_limited = name_limited;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public String getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(String absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public String getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(String estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public String getHazardous() {
        return hazardous;
    }

    public void setHazardous(String hazardous) {
        this.hazardous = hazardous;
    }

    public List<ApproachData> getApproachData() {
        return approachData;
    }

    public void setApproachData(List<ApproachData> approachData) {
        this.approachData = approachData;
    }

    public OrbitalData getOrbitalData() {
        return orbitalData;
    }

    public void setOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
    }

    public String getIsSentryObject() {
        return isSentryObject;
    }

    public void setIsSentryObject(String isSentryObject) {
        this.isSentryObject = isSentryObject;
    }

    @Override
    public String toString() {
        return "NearEarthObject{" +
                "link='" + link + '\'' +
                ", id='" + id + '\'' +
                ", neo_ref_id='" + neo_ref_id + '\'' +
                ", name='" + name + '\'' +
                ", name_limited='" + name_limited + '\'' +
                ", designation='" + designation + '\'' +
                ", nasa_jpl_url='" + nasa_jpl_url + '\'' +
                ", absolute_magnitude_h='" + absolute_magnitude_h + '\'' +
                ", estimated_diameter='" + estimated_diameter + '\'' +
                ", hazardous='" + hazardous + '\'' +
                ", approachData=" + approachData +
                ", orbitalData=" + orbitalData +
                ", isSentryObject='" + isSentryObject + '\'' +
                '}';
    }
}
