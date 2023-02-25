package com.phonebook.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.main.Entity.Contact;
import com.phonebook.main.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository repository;

	@Override
	public String saveContact(Contact contact) {
		
		Contact savedContact = repository.save(contact);
		
		if(savedContact.getContactId() != null) {
			return "Contact Saved Successfully";
		}else {
			return "Contact could not be saved";
		}
	}


	@Override
	public Contact getContactById(Integer id) {
		
		Optional<Contact> contactById = repository.findById(id);
		
		if(contactById.isPresent()) {
			return contactById.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Contact> getAllContact() {
		
		List<Contact> allContacts = repository.findAll();
		return allContacts;
	}

	@Override
	public String updateContact(Contact contact) {
		
		if(repository.existsById(contact.getContactId())) {
			repository.save(contact);
			return "Contact Updated Successfully";
		}else {
			return "No Such Contact Exists";
		}
		
	}

	@Override
	public String deleteContactById(Integer id) {
		
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Contact Deleted";
		}else {
			return "Contact Does Not Exist"; 
		}
	}

}
