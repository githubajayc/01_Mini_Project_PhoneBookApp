package com.phonebook.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.main.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
