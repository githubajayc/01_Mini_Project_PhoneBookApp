package com.phonebook.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebook.main.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
