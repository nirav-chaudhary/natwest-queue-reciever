package com.niravchaudhary.receiverservice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
    private Long accountNumber;
    private String type;
    private Double amount;
    private String currency;
    private Long accountFrom;

}
