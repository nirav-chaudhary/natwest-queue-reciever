package com.niravchaudhary.receiverservice.service;

import java.util.Optional;

import com.niravchaudhary.receiverservice.entity.Transaction;

public interface TransactionService {
	public void saveTransaction(Transaction transaction);

	public Optional<Transaction> getTransactionById(Long transactionId); 
}
