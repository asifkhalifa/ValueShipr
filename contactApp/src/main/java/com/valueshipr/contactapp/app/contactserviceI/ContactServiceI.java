package com.valueshipr.contactapp.app.contactserviceI;

import java.util.List;
import com.valueshipr.contactapp.app.model.Contact;

public interface ContactServiceI {

	public Contact addContact(Contact contact);

	public List<Contact> getContacts();

	public Contact updateContact(Long id, Contact contact);

	public void deleteContact(Long id);

	public Contact getContactByNumber(String number);

	public void addEmergencyContacts();
    
}
