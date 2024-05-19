package com.gymcontact.contact.controller;

import com.gymcontact.contact.entity.Contact;
import com.gymcontact.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @PostMapping("/save/contact")
    public Contact saveAdherant(@RequestBody Contact contact){
        return  contactService.saveContact(contact);

    }

    @GetMapping("/get/contact")
    public List<Contact> getContacts(){
        return  contactService.getContacts();
    }

    @GetMapping("/get/contact/{contactId}")
    public Contact getContact(@PathVariable Integer contactId){
        return  contactService.getContacts(contactId);
    }

    @DeleteMapping("/delete/contact/{contactId}")
    public void deleteContact(@PathVariable Integer contactId){
        contactService.deleteContact(contactId);

    }

    @PutMapping("/update/contact")
    public Contact updateContact(@RequestBody Contact contact){
        return contactService.updateContact(contact);
    }
}
