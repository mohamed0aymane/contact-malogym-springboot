package com.gymcontact.contact.dao;

import com.gymcontact.contact.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends CrudRepository<Contact,Integer> {
}
