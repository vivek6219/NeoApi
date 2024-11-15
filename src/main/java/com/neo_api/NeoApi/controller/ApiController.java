package com.neo_api.NeoApi.controller;

import java.util.List;

import com.neo_api.NeoApi.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    @Autowired
    WebService webService;

    @GetMapping("/")
    private Mono<String> getOverallDataSet(){
        return webService.allDataSets();
    }
}
