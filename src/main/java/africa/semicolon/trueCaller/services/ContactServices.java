package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;

public interface ContactServices {
     void addContact(String firstName, String lastName, String phoneNumber);
     Contact findById(int i)  ;
     Contact removeContact(Contact contact);
     Contact updateContact( int id,Contact contact);

}
