package com.kafkaproducer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproducer.model.TransactionRequest;
import com.kafkaproducer.model.TransactionResponse;
import com.kafkaproducer.service.TransactioService;

@RestController
@RequestMapping("/kafka/sendRequest")
public class TransactionController {

	@Autowired
	private TransactioService sender;

	private static final Logger log = LoggerFactory.getLogger(TransactionController.class);

	// sample controller to send to send transaction request
	@RequestMapping(value = "/transactionRequest", method = RequestMethod.POST)
	ResponseEntity<?> getSuccessTransactionRequest(@RequestBody TransactionRequest request) {

		// log request object into log4j2
		String str = sender.writeObjectAsString(request);
		log.info("kafakatestlog testing fillter " + str);
		System.out.println("Successfully produced msg to Kafaka :" + str);

		// sending response and log response object into log4j2
		TransactionResponse response = sender.getTransactionResponseObject(request);
		String str2 = sender.writeObjectAsString(response);
		log.info("kafakatestlog testing fillter " + str2);
		System.out.println("Successfully produced produced msg to Kafaka :" + str2);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
