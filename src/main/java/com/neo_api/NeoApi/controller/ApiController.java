package com.neo_api.NeoApi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Value("${app.api.key}")
    private String api_key;

    private String urlOverallDataSet = "https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=";

    @GetMapping("/")
    private String getOverallDataSet(){
        return "Hello";
    }
}
