package com.phonebook.main.Service;

import java.util.List;
import com.phonebook.main.Entity.Contact;

public interface ContactService {


	public String saveContact(Contact contact);
	
	public Contact getContactById(Integer id);
	
	public List<Contact> getAllContact();
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer id);
}
