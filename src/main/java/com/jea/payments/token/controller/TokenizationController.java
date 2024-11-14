package com.jea.payments.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jea.payments.token.model.CardData;
import com.jea.payments.token.service.TokenizationService;

@RestController
@RequestMapping("/api/tokenization")
public class TokenizationController {

    @Autowired
    private TokenizationService tokenizationService;

    @PostMapping("/tokenize")
    public ResponseEntity<String> tokenize(@RequestBody CardData cardData) {
        String token = tokenizationService.tokenizeCard(cardData);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/detokenize/{token}")
    public ResponseEntity<CardData> detokenize(@PathVariable String token) {
        CardData cardData = tokenizationService.detokenizeCard(token);
        return ResponseEntity.ok(cardData);
    }
}
