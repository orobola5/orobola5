package EmailApp.data.Repositories;

import EmailApp.data.models.Email;
import africa.semicolon.trueCaller.data.Repositories.ContactRepository;
import africa.semicolon.trueCaller.data.Repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAppRepImpTest {
    private EmailAppRep emailAppRep;

    @BeforeEach public void setUp() {
      emailAppRep = new EmailAppRepImp();
    }


    @Test void createEmail() {

 

    }

    @Test
    void setDepartment() {
    }

    @Test
    void randomPassword() {
    }
}