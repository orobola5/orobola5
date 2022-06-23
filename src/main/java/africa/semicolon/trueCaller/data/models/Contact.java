package africa.semicolon.trueCaller.data.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Document("Contacts")
public class Contact {

    private int id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String phoneNumber;



}
