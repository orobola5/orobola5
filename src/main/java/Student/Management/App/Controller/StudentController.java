package Student.Management.App.Controller;

import Student.Management.App.Data.Models.Student;
import Student.Management.App.Services.StudentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentServicesImpl studentServices;

    @Autowired
    public StudentController(StudentServicesImpl studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping
    public List<Student> getStudents() {
//        return studentServices.add;
        return null;
    }
}
