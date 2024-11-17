package com.neo_api.NeoApi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NeoData {
    private List<String> links;

    private List<Page> page;

    @JsonProperty("near_earth_objects")
    private List<NearEarthObject> near_earth_objects;



}
