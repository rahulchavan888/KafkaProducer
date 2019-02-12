package com.kafkaproducer.service;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkaproducer.model.TransactionRequest;
import com.kafkaproducer.model.TransactionResponse;

@Service
public class TransactioService {

	// sample method to get response object
	public TransactionResponse getTransactionResponseObject(TransactionRequest request) {
		return new TransactionResponse(request.getTransaction_id(), request.getAmount(), request.getUser_name(),
				request.getFrom_account(), request.getTo_account(), request.getCurrency(), request.getDate(),
				request.getRemark(), "Success");
	}

	// method to convert and wrap the object into json string
	public String writeObjectAsString(Object object) {
		String str = null;
		try {
			JSONObject wrapper = new JSONObject();
			wrapper.put("type", object.getClass().getSimpleName());
			wrapper.put("value", new ObjectMapper().writeValueAsString(object));
			str = wrapper.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return str;
	}
}
