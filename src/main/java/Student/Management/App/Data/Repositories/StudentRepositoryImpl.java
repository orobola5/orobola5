package Student.Management.App.Data.Repositories;

import Student.Management.App.Data.Models.Student;
import Student.Management.App.Data.Repositories.StudentRepository;

import java.util.ArrayList;

public class StudentRepositoryImpl implements StudentRepository {
    private  int size;
    ArrayList<Student>students=new ArrayList<>();



    @Override
    public Student saveStudent(Student student) {
        student.setId((long) (students.size() + 1));
            students.add(student);
            return student;


    }

    @Override
    public int size() {
        return students.size();
    }

    @Override
    public ArrayList<Student> findByName(String name) {
        Student student;
        for (Student value : students) {
            student = value;
            if (name.equals(student.getName()))
                return  student;
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
