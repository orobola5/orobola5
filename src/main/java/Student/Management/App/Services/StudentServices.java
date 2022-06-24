package Student.Management.App.Services;

import Student.Management.App.Data.Models.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface StudentServices {
    List<Student> addStudent(long id, String name, int age, String email, LocalDate dob);

    Student findById(int id);

    Student removeStudent(Student student);
    Student updateFeePaid( int fees);

    ArrayList<Student> findByName(String name);
}
