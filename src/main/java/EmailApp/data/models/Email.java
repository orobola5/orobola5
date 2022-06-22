package EmailApp.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Email {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;

    Email email = new Email();


}
/*things my email can do
constructor
the department of the mail
the mailbox capacity
the alternative mail
generate random password
change password

* */