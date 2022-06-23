package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends MongoRepository<Contact,String> {

    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName(String lastName);
    Contact findByPhoneNumber(String phoneNumber);


    Optional<Contact> findById(String id);

}
