package EmailApp.data.Repositories;

import EmailApp.data.models.Email;

public interface EmailAppRep {
    void createEmail(String firstName, String lastName);
    Email setDepartment();

    String randomPassword(int length);


}
