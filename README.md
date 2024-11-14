# Tokenization Service for Secure Payment Data Management

This project is a microservice-based application built with Spring Boot, designed to securely tokenize sensitive payment data. By transforming card data into tokens, the service reduces PCI DSS compliance scope and provides safe storage practices for sensitive information.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
  - [API Endpoints](#api-endpoints)
- [Security](#security)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Tokenization of Sensitive Payment Data**: Generates secure tokens for sensitive card data.
- **Vaultless Token Management**: Tokenizes data without needing a separate vault for efficient processing.
- **Token-to-Card Mapping**: Maintains a secure mapping between tokens and original card data.
- **Data Encryption**: Applies AES encryption for secure data storage.
- **Secure RESTful API**: Provides endpoints for tokenization and detokenization with authentication.

## Project Structure

- **`src/main/java`**: Contains the application code.
  - **`controller`**: Defines RESTful endpoints.
  - **`service`**: Contains business logic for tokenization and detokenization.
  - **`repository`**: Interfaces for database interactions.
  - **`model`**: Defines data models for token and card data.
  - **`config`**: Contains security configurations.

## Getting Started

### Prerequisites

- **Java 11+**
- **Maven 3.6+**
- **Database**: H2 (in-memory) for development; MySQL/PostgreSQL for production

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/tokenization-service.git
   cd tokenization-service
