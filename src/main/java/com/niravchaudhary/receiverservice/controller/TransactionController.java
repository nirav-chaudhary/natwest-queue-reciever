package com.niravchaudhary.receiverservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niravchaudhary.receiverservice.entity.Transaction;
import com.niravchaudhary.receiverservice.service.TransactionService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(value = "transaction/")
@Slf4j
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<Transaction> receiveTransaction(@RequestBody Transaction transaction){
		transactionService.saveTransaction(transaction);
		log.info("entity successfully saved");
		return ResponseEntity.created(null).build();
	}
	
	@GetMapping(value= "/{transactionId}")
	public ResponseEntity<Transaction> getTransaction(@PathVariable Long transactionId){
		Optional<Transaction> optTransaction = transactionService.getTransactionById(transactionId);
		if(optTransaction.isPresent()) {
			return ResponseEntity.ok().body(optTransaction.get());
		}else {
			throw new IllegalArgumentException("Invalid transaction ID!! No transaction with given Id exists");
		}
		
	}
	
}
