package com.example.transactionstarter.transaction.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Currency {
    INR,
    USD;

    @JsonCreator
    public static Currency fromValue(String value) {

        if (value == null) {
            return null;
        }

        try {
            return Currency.valueOf(
                    value.trim().toUpperCase()
            );
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(
                    "Invalid transaction type: " + value
            );
        }
    }
}