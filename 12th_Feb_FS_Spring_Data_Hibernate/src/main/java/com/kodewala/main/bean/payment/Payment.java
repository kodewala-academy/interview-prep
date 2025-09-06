package com.kodewala.main.bean.payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Payment
{

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int amount;
	@Column
	private String paymentStatus;

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public String getPaymentStatus()
	{
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

}
