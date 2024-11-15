package com.neo_api.NeoApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebService {

    @Value("${app.api.key}")
    private String api_key;

    private String urlOverallDataSet = "https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=";

    private final WebClient webClient;

    public WebService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://api.nasa.gov/neo/rest/v1/neo").build();
    }

    public Mono<String> allDataSets(){
        return this.webClient
                .mutate()
                .codecs(configurer -> configurer.defaultCodecs()
                                  .maxInMemorySize(16*1024*1024))
                .build()
                .get()
                .uri("/browse?api_key={api_key}",api_key)
                .retrieve()
                .bodyToMono(String.class);
    }
}
