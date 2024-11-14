package com.jea.payments.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jea.payments.token.model.CardData;

public interface CardDataRepository extends JpaRepository<CardData, Long> { }


