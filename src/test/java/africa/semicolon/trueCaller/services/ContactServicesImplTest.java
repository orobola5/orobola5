package africa.semicolon.trueCaller.services;



import africa.semicolon.trueCaller.data.Repositories.ContactRepository;
import africa.semicolon.trueCaller.data.Repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServicesImplTest {
    private ContactServices contactServices;
    private ContactRepository contactRepository;

    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
        contactServices = new ContactServicesImpl(contactRepository);

    }

    @Test
    Contact addContact() {
        contactServices.addContact("asa", "boll", "5676");
        Contact contact = contactServices.findById(1);
        assertEquals("asa", contact.getFirstName());
        assertEquals("boll", contact.getLastName());
        assertEquals("5676", contact.getPhoneNumber());
        assertEquals(1, contactRepository.count());
        return contact;
    }

    @Test
    void findById() {
        contactServices.addContact("love", "rr", "9090");
        contactServices.addContact("rr", "yuo", "5656");
        contactServices.addContact("rtu", "thdk", "6754");
        contactServices.addContact("rgsk", "gtu", "6756");

        Contact contact = contactServices.findById(3);
        assertEquals("rtu", contact.getFirstName());
        assertEquals("thdk", contact.getLastName());
        assertEquals("6754", contact.getPhoneNumber());
        assertEquals(3, contact.getId());
        assertEquals(4, contactRepository.count());


    }

    @Test
    void removeContact() {

        contactServices.addContact("love", "rr", "9090");
        contactServices.addContact("rr", "yuo", "5656");
        contactServices.addContact("rtu", "thdk", "6754");
        contactServices.addContact("rgsk", "gtu", "6756");

        Contact contactRev = contactServices.removeContact(new Contact("love", "rr", "9090"));
        assertEquals(0, contactRev.getId());
        assertEquals(3, contactRepository.count());


    }

    @Test
    void updateContact() {
        contactServices. addContact("sam", "kufre", "0806");
       contactServices. addContact("chris", "kuma", "0908");
       contactServices.addContact("ola", "Abiola", "0705");


        Contact updateContact1 = contactServices.updateContact(1,new Contact("sam","kufre","0806"));
        updateContact1.setFirstName("luke");
        Contact updateContact2 = contactServices.updateContact(2, new Contact("chris","kuma","0908"));
        updateContact2.setPhoneNumber("0802");

        assertEquals("luke", updateContact1.getFirstName());
        assertEquals("0802", updateContact2.getPhoneNumber());
        assertEquals(3, contactRepository.count());

    }
}