package com.example.transactionstarter.transaction.service.interfaces;

import com.example.transactionstarter.transaction.dto.CreateTransactionRequest;
import com.example.transactionstarter.transaction.entity.Transaction;

public interface TransactionService {
    Transaction createTransaction(CreateTransactionRequest request);
    Transaction getTransaction(String TransactionId);
}
