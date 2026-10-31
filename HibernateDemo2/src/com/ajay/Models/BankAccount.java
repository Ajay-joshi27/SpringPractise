package com.ajay.Models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class BankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue()
	private int id;
	
	private String name;
	
	private int accountNumber;
	
	@Version
	private int transactionCount;

	@CreationTimestamp
	private LocalDateTime openTime;
	@UpdateTimestamp
	private LocalDateTime updateTime;
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getTransactionCount() {
		return transactionCount;
	}


	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}


	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", transactionCount="
				+ transactionCount + "]";
	}
	

}
