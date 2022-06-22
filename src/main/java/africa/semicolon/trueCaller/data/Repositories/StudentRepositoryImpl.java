package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.models.Student;

import java.util.ArrayList;

public class StudentRepositoryImpl implements StudentRepository {
    private  int size;
    ArrayList<Student>students=new ArrayList<>();



    @Override
    public Student saveStudent(Student student) {
        student.setId(students.size() + 1);
            students.add(student);
            return student;


    }

    @Override
    public int size() {
        return students.size();
    }

    @Override
    public Student findByName(String name) {
        Student student = new Student();
        for (Student value : students) {
            student = value;
            if (name.equals(student.getName()))
                return student;
        }
        throw new ArrayIndexOutOfBoundsException("index out of bound");

    }

    @Override
    public Student findById(int id) {
        return students.get(id-1);
    }

    @Override
    public Student removeStudent(Student student) {
        return null;
    }

    @Override
    public Student updateFeesPaid(int fees) {
        Student student = new Student();

       student.setFeesPaid(fees);

        return student;
    }
}
