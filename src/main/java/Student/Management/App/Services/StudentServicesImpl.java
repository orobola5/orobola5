package Student.Management.App.Services;

import Student.Management.App.Data.Models.Student;
import Student.Management.App.Data.Repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServicesImpl implements StudentServices {
    private StudentRepository studentRepository;



    @Override
    public ArrayList<Student> findByName(String name) {
        ArrayList<Student> studentsName = new ArrayList<>(studentRepository.findByName(name));


        return studentsName;
    }



    @Override
        public List<Student> addStudent(long id,
        String name,
        int age,
        String email,
        LocalDate dob)
        {
            return List.of(new Student(id,name,age,email,dob));

        }





    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student removeStudent(Student student) {
        return studentRepository.removeStudent(student);

    }


    @Override
    public Student updateFeePaid(int fees) {
        Student student = new Student();

        student.setFeesPaid(fees);

        return student;

    }


    public void setStudent() {
//        return stud;
    }

}
