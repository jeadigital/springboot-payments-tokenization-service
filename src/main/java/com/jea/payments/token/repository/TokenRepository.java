package com.jea.payments.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jea.payments.token.model.Token;

public interface TokenRepository extends JpaRepository<Token, String> { }