package com.phonebook.main.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.main.Entity.Contact;
import com.phonebook.main.Service.ContactServiceImpl;

@RestController
public class ContactController {

	private ContactServiceImpl contactService;
	
	@PostMapping("/save")
	public String saveContact(@RequestBody Contact contact) {
		
		 String saveContact = contactService.saveContact(contact);
		 return saveContact;
	}
	
	@GetMapping("/get/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		
		Contact contactById = contactService.getContactById(contactId);

		return contactById;
    }
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		
		List<Contact> allContact = contactService.getAllContact();
		
		return allContact;
	}
	
	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		
		return contactService.updateContact(contact);
	}

	@DeleteMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		
		return contactService.deleteContactById(contactId);
	}






}