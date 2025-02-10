package dev.Zerphyis.challengeJava.controller;

import dev.Zerphyis.challengeJava.service.VogalService;
import dev.Zerphyis.challengeJava.vogal.DadosVogal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ControllerVogal {
    @Autowired
    VogalService service;

    @PostMapping
    public ResponseEntity<DadosVogal> processarString(@RequestBody Map<String, String> request) {
        String input = request.get("palavraPassada");
        Instant start = Instant.now();
        char vogalEncontrada = service.encontrarVogalUnica(input);
        Instant end = Instant.now();

        String tempoTotal = Duration.between(start, end).toMillis() + "ms";
        DadosVogal response = new DadosVogal(input, vogalEncontrada, tempoTotal);
        service.salvarResultado(response);

        return ResponseEntity.ok(response);
    }
}
