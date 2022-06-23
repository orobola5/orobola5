package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;

public interface ContactServices {
     void addContact(String firstName, String lastName, String phoneNumber);

     Contact findById(String id);

     void removeContact(Contact contact);
     Contact updateContact( int id,Contact contact);
     Contact findByFirstName(String firstName);
 Contact findByPhoneNumber(String phoneNumber);
     ArrayList<Contact> findByName(String name);
}
