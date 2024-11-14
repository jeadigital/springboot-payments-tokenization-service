package com.jea.payments.token.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jea.payments.token.model.CardData;
import com.jea.payments.token.model.Token;
import com.jea.payments.token.repository.CardDataRepository;
import com.jea.payments.token.repository.TokenRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TokenizationService {

    @Autowired
    private CardDataRepository cardDataRepository;

    @Autowired
    private TokenRepository tokenRepository;

    public String tokenizeCard(CardData cardData) {
        CardData savedCard = cardDataRepository.save(cardData);
        String token = UUID.randomUUID().toString(); // Example of vaultless tokenization
        Token tokenEntity = new Token();
        tokenEntity.setToken(token);
        tokenEntity.setCardId(savedCard.getId());
        tokenEntity.setCreatedDate(LocalDateTime.now());
        tokenRepository.save(tokenEntity);
        return token;
    }

    public CardData detokenizeCard(String token) {
        Token tokenEntity = tokenRepository.findById(token)
            .orElseThrow(() -> new EntityNotFoundException("Token not found"));
        return cardDataRepository.findById(tokenEntity.getCardId())
            .orElseThrow(() -> new EntityNotFoundException("Card data not found"));
    }
}
