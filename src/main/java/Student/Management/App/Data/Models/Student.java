package Student.Management.App.Data.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Student extends ArrayList<Student> {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private String email;
    @NonNull
    private LocalDate dob;
    private  Integer grade;
    private Integer feesPaid;
    private Integer totalFees;


    }

