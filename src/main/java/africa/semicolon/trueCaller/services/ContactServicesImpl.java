package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.Repositories.ContactRepository;
import africa.semicolon.trueCaller.data.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class ContactServicesImpl implements ContactServices{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName,lastName,phoneNumber);

        contactRepository.save(contact);

    }



    @Override
    public Contact findById(String id) {
        Optional<Contact> found =contactRepository.findById(id);
        if(found.isEmpty()) throw new NoContactException("Contact not found");
        return found.get();
    }

    @Override
    public void removeContact(Contact contact) {
        contactRepository.delete(contact);

    }

    @Override
    public Contact updateContact( int id,Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact findByFirstName(String firstName) {;

        return null;
    }

    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        return contactRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public ArrayList <Contact> findByName(String name) {
       ArrayList<Contact>result = new ArrayList<>();
        result.addAll(contactRepository.findByFirstName(name));
        result.addAll(contactRepository.findByLastName(name));
        return result;
    }


}
