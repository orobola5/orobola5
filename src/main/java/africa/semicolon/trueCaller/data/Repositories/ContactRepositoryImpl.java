package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {
     private int count ;
     ArrayList<Contact>contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
//        if(contact.getId()!=0)updateContact()
        contact.setId(contacts.size()+1);
        contacts.add(contact);
        return contact;
    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public Contact findByFirstName(String firstName) {
        Contact contact;
        for (int i = 0; i < contacts.size(); i++) {
            contact=contacts.get(i);
            if (firstName.equals(contact.getFirstName()))
                return contact;

            }
            throw new NullPointerException("contact not found");

        }


    @Override
    public Contact findById(int id) {
        Contact contact;
        contact= contacts.get(id - 1);
        return contact;

    }
    @Override
    public Contact deleteContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact u=contacts.get(i);
            if(contact.equals(u)){
            contact.setId(contacts.size() - 1);
            }
            contacts.remove(contact);
        }
        return contact;
    }


    public Contact updateContact(int id, Contact contact) {

        for(int i = 0; i < contacts.size(); i++) {

            Contact x = contacts.get(i);

            if(x.getId()==(id)) {

                contacts.set(i, contact);
            }
        }
        return contact;
    }
}
