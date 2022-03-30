package com.niravchaudhary.receiverservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niravchaudhary.receiverservice.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
