package com.niravchaudhary.receiverservice.controller;

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


@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<Transaction> receiveTransaction(@RequestBody Transaction transaction){
		transactionService.saveTransaction(transaction);
		return ResponseEntity.ok().build();
	}

}
