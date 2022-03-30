package com.niravchaudhary.receiverservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niravchaudhary.receiverservice.entity.Transaction;
import com.niravchaudhary.receiverservice.repository.TransactionRepository;
import com.niravchaudhary.receiverservice.service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
		log.info(transaction.getTransactionId()+" saved successfu");
	}

	@Override
	public Optional<Transaction> getTransactionById(Long transactionId) {
		return transactionRepository.findById(transactionId);
	}

}
