package com.projet.tpachatproject.controllers;

import com.projet.tpachatproject.entities.PredictionRequest;
import com.projet.tpachatproject.services.FastApiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class FastApiController {
    private FastApiService fastApiService;

    public FastApiController(FastApiService fastApiService) {
        this.fastApiService = fastApiService;
    }

    @PostMapping("/predict")
    public Mono<FastApiService.PredictionResponse> predict(@RequestBody PredictionRequest request) {
        return fastApiService.predict(request);
    }
}


