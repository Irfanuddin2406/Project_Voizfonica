package com.sr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	private String service;
	private int validity;
	private String emailId;
	private String benifits;
	private long phone;
	private String cardno;
	private int cvv;
	private String expiry;
	
	public Payment() {
	}

	public Payment(int id, String name, int cost, String service, int validity, String emailId, String benifits,
			long phone, String cardno, int cvv, String expiry) {
		
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.service = service;
		this.validity = validity;
		this.emailId = emailId;
		this.benifits = benifits;
		this.phone = phone;
		this.cardno = cardno;
		this.cvv = cvv;
		this.expiry = expiry;
	}

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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBenifits() {
		return benifits;
	}

	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", name=" + name + ", cost=" + cost + ", service=" + service + ", validity="
				+ validity + ", emailId=" + emailId + ", benifits=" + benifits + ", phone=" + phone + ", cardno="
				+ cardno + ", cvv=" + cvv + ", expiry=" + expiry + "]";
	}

	
	
	
}
