package com.niravchaudhary.receiverservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niravchaudhary.receiverservice.entity.Transaction;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
	
	@PostMapping
	public ResponseEntity<Transaction> receiveTransaction(@RequestBody Transaction transaction){
		return ResponseEntity.ok().build();
	}

}
