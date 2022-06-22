package africa.semicolon.trueCaller.data.Repositories;

import africa.semicolon.trueCaller.data.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {
    private StudentRepository studentRepository;

    @BeforeEach public void setUp() {
        studentRepository = new StudentRepositoryImpl();

    }

    @Test void saveStudent() {
        Student student1 = new Student(1,"Sam Adeyemi",100);
        Student student2 = new Student(2,"Sammy odeyemi",90);

        Student saveStudent1= studentRepository.saveStudent(student1);
        Student saveStudent2= studentRepository.saveStudent(student2);

        assertEquals(2,studentRepository.size());

    }

    @Test
    void findStudentByName() {
        Student student1 = new Student(1,"Sam Adeyemi",100);
        Student student2 = new Student(2,"Sammy odeyemi",90);
        Student student3 = new Student(3,"dami eyemi",70);

        Student saveStudent1= studentRepository.saveStudent(student1);
        Student saveStudent2= studentRepository.saveStudent(student2);
        Student saveStudent3= studentRepository.saveStudent(student3);

        Student searchForStudent = studentRepository.findByName("Sammy odeyemi");

        assertEquals("Sammy odeyemi",searchForStudent.getName());

    }

    @Test void findById() {
        Student student1 = new Student(1,"Sam Adeyemi",100);
        Student student2 = new Student(4,"Sammy odeyemi",90);
        Student student3 = new Student(3,"dami eyemi",70);
        Student student4 = new Student(2,"dom yemi",60);

        Student saveStudent1= studentRepository.saveStudent(student1);
        Student saveStudent2= studentRepository.saveStudent(student4);
        Student saveStudent3= studentRepository.saveStudent(student3);
        Student saveStudent4= studentRepository.saveStudent(student2);

        Student searchForStudent = studentRepository.findById(4);
        Student searchForStudent2 = studentRepository.findById(2);

        assertEquals(4,searchForStudent.getId());
        assertEquals(2,searchForStudent2.getId());

    }

    @Test
    void removeStudent() {
    }

    @Test
    void updateFeesPaid() {Student student1 = new Student(1,"Sam Adeyemi",100);
        Student student2 = new Student(4,"Sammy odeyemi",90);
        Student student3 = new Student(3,"dami eyemi",70);
        Student student4 = new Student(2,"dom yemi",60);

        Student saveStudent1= studentRepository.saveStudent(student1);
        Student saveStudent2= studentRepository.saveStudent(student4);
        Student saveStudent3= studentRepository.saveStudent(student3);
        Student saveStudent4= studentRepository.saveStudent(student2);

        Student searchForStudent = studentRepository.findById(4);
        Student updateFeesPaid = studentRepository.updateFeesPaid(400_000);
        assertEquals(4,searchForStudent.getId());
        assertEquals(400_000,updateFeesPaid.getFeesPaid());


        Student searchForStudent2 = studentRepository.findById(2);
        Student updateFeesPaid1= studentRepository.updateFeesPaid(250_000);
//       Student updateFeesPaid2=studentRepository.updateFeesPaid(200_000);



        assertEquals(2,searchForStudent2.getId());
        assertEquals(250_000,updateFeesPaid1.getFeesPaid());



    }
}