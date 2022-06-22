package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.models.Student;

public interface StudentRepository {
Student saveStudent(Student student);
    int size();
    Student findByName(String name);
    Student findById(int id);
    Student removeStudent(Student student);
    Student updateFeesPaid(int fees);

}
