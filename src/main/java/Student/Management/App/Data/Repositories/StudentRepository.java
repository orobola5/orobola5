package Student.Management.App.Data.Repositories;

import Student.Management.App.Data.Models.Student;

import java.util.ArrayList;

public interface StudentRepository {
Student saveStudent(Student student);

    ArrayList<Student> findByName(String name);
    Student findById(int id);
    Student removeStudent(Student student);
    Student updateFeesPaid(int fees);

}
