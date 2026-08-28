package com.example.transactionstarter.transaction.service.interfaces;

import com.example.transactionstarter.transaction.dto.CreateTransactionRequest;
import com.example.transactionstarter.transaction.entity.Transaction;

public interface TransactionService {
    public Transaction createTransaction(CreateTransactionRequest request);
}
