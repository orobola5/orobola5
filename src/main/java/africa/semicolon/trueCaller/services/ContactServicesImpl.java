package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.Repositories.ContactRepository;
import africa.semicolon.trueCaller.data.models.Contact;


public class ContactServicesImpl implements ContactServices{
    private ContactRepository contactRepository;
    int size;

    public ContactServicesImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName,lastName,phoneNumber);

        contactRepository.save(contact);

    }

    @Override
    public Contact findById(int i) {
        Contact contact;
        contact = contactRepository.findById(i);
        System.out.println(contact);
        return contact;

    }

    @Override
    public Contact removeContact( Contact contact) {
        contact=contactRepository.deleteContact(contact);
        System.out.println(contact);;
        return contact;
    }

    @Override
    public Contact updateContact( int id,Contact contact) {
        return contactRepository.updateContact(id,contact);
    }


}
