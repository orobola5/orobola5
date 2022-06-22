package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    private ContactRepository contactRepository;

    @BeforeEach
    public void setUp() {
        contactRepository = new ContactRepositoryImpl();

    }

    @Test
    void saveContact_countIsOneTest() {
        Contact contact = new Contact();
        contact.setFirstName("samson");

        Contact savedContact = contactRepository.save(contact);
        assertEquals(1, savedContact.getId());
        assertEquals(1, contactRepository.count());

    }

    @Test
    void saveContactTwice_countIsOneTest() {
        Contact contact = new Contact();
        contact.setFirstName("samson");
        Contact contact1 = new Contact();
        contact1.setFirstName("ladi");

        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact1);
        assertEquals(1, savedContact.getId());
        assertEquals(2, savedContact2.getId());
        assertEquals(2, contactRepository.count());


    }

    @Test
    void saveContact_findByIdReturnContact() {
        Contact contact = new Contact();
        contact.setFirstName("sam");
        Contact contact1 = new Contact();
        contact1.setFirstName("abiola");


        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact1);

        Contact foundContact = contactRepository.findById(1);
        Contact secondContact = contactRepository.findById(2);

        assertEquals(1, foundContact.getId());
        assertEquals(2, secondContact.getId());
        assertEquals("sam", foundContact.getFirstName());
        assertEquals("abiola", secondContact.getFirstName());

    }

    @Test
    void findByFirstName_returnFirstName() {
        Contact contact = new Contact();
        contact.setFirstName("sam");
        Contact contact1 = new Contact();
        contact1.setFirstName("abiola");


        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact1);

        Contact foundContactByName = contactRepository.findByFirstName("sam");
        Contact secondContactByName = contactRepository.findByFirstName("abiola");

        assertEquals("sam", foundContactByName.getFirstName());
        assertEquals("abiola", secondContactByName.getFirstName());


    }
    @Test void deleteContact(){
        Contact contact1 = new Contact("sam","kufre","0806");
        Contact contact2 = new Contact("chris","kuma","0908");
       Contact contact3 = new Contact("ola","Abiola","0705");

        Contact savedContact1 = contactRepository.save(contact1);
        Contact savedContact2 = contactRepository.save(contact2);
        Contact savedContact3 = contactRepository.save(contact3);

        Contact removeContact1 = contactRepository.deleteContact(contact1);
        assertEquals("0806", removeContact1.getPhoneNumber());
        assertEquals("sam", removeContact1.getFirstName());
        assertEquals("kufre", removeContact1.getLastName());


       Contact removeContact2 = contactRepository.deleteContact(contact2);
       assertEquals("0908", removeContact2.getPhoneNumber());
        assertEquals("chris", removeContact2.getFirstName());
        assertEquals("kuma", removeContact2.getLastName());



        assertEquals(1,contactRepository.count());

    }
    @Test void updateContact(){
        Contact contact = new Contact("sam","kufre","0806");
        Contact contact1 = new Contact("chris","kuma","0908");
        Contact contact2 = new Contact("ola","Abiola","0705");

        Contact savedContact1 = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact1);
        Contact savedContact3 = contactRepository.save(contact2);

        Contact updateContact1=contactRepository.updateContact(1,contact);
        contact.setFirstName("luke");
        Contact updateContact2=contactRepository.updateContact(2,contact1);
        contact1.setPhoneNumber("0802");

        assertEquals("luke", updateContact1.getFirstName());
        assertEquals("0802", updateContact2.getPhoneNumber());
        assertEquals(3, contactRepository.count());




    }

}