package com.phonebook.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Contact_Details")
public class Contact {


	public Contact() {
		super();
		
	}
	public Contact(Integer contactId, String contactName, String contactEmail, Long contctNum) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contctNum = contctNum;
	}
	@Id
	@GeneratedValue
	private Integer contactId;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Long getContctNum() {
		return contctNum;
	}
	public void setContctNum(Long contctNum) {
		this.contctNum = contctNum;
	}
	private String contactName;
	private String contactEmail;
	private Long contctNum;
}
