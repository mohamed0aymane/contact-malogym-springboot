package com.gymcontact.contact.service;

import com.gymcontact.contact.dao.ContactDao;
import com.gymcontact.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactDao contactDao;

    public Contact saveContact(Contact contact){
        return contactDao.save(contact);
    }
    public List<Contact> getContacts(){
        List<Contact> contacts=new ArrayList<>();
        contactDao.findAll().forEach(contacts::add);
        return contacts;
    }

    public Contact getContacts(Integer contactId){
        return  contactDao.findById(contactId).orElseThrow();
    }
    public void deleteContact(Integer contactId){
         contactDao.deleteById(contactId);
    }

    public Contact updateContact(Contact contact){
        contactDao.findById(contact.getContactId()).orElseThrow();
        return contactDao.save(contact);
    }

}
