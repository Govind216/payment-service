package dev.payments.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PaymentRequest (
        @NotNull Long senderId, @NotNull Long receiverId, @NotNull @Positive Long amount, @NotBlank String currency){}