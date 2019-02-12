package com.kafkaproducer.model;

import java.util.Date;

public class TransactionRequest {

	private String transaction_id;
	private int amount;
	private String user_name;
	private long from_account;
	private long to_account;
	private String currency;
	private Date date;
	private String remark;

	public TransactionRequest() {
		super();
	}

	public TransactionRequest(String transaction_id, int amount, String user_name, long from_account, long to_account,
			String currency, Date date, String remark) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.user_name = user_name;
		this.from_account = from_account;
		this.to_account = to_account;
		this.currency = currency;
		this.date = date;
		this.remark = remark;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getFrom_account() {
		return from_account;
	}

	public void setFrom_account(long from_account) {
		this.from_account = from_account;
	}

	public long getTo_account() {
		return to_account;
	}

	public void setTo_account(long to_account) {
		this.to_account = to_account;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TransactionRequest [transaction_id=" + transaction_id + ", amount=" + amount + ", user_name="
				+ user_name + ", from_account=" + from_account + ", to_account=" + to_account + ", currency=" + currency
				+ ", date=" + date + ", remark=" + remark + "]";
	}

}
