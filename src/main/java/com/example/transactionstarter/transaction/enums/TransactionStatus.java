package com.example.transactionstarter.transaction.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TransactionStatus {
    PENDING,
    SUCCESS,
    FAILED;

    @JsonCreator
    public static TransactionStatus fromValue(String value) {

        if (value == null) {
            return null;
        }

        try {
            return TransactionStatus.valueOf(
                    value.trim().toUpperCase()
            );
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(
                    "Invalid transaction status: " + value
            );
        }
    }
}