package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;

public interface ContactRepository {
    Contact save(Contact contact);
    int count();
    Contact findByFirstName(String firstName);
    Contact findById(int id);
    Contact deleteContact(Contact contact);
    Contact updateContact(int id,Contact contact);




}
